package players.mcts;

import core.GameState;
import players.optimisers.ParameterizedPlayer;
import players.Player;
import utils.ElapsedCpuTimer;
import utils.StatSummary;
import utils.Types;

import java.util.ArrayList;
import java.util.Random;

public class MCTSPlayer extends ParameterizedPlayer {

    /**
     * Random generator.
     */
    private Random m_rnd;

    /**
     * All actions available.
     */
    public Types.ACTIONS[] actions;

    /**
     * Params for this MCTS
     */
    public MCTSParams params;

    public MCTSPlayer(long seed, int id) {
        this(seed, id, new MCTSParams());
    }

    public StatSummary ss;


    public MCTSPlayer(long seed, int id, MCTSParams params) {
        super(seed, id, params);
        reset(seed, id);

        ss = new StatSummary();

        ArrayList<Types.ACTIONS> actionsList = Types.ACTIONS.all();
        actions = new Types.ACTIONS[actionsList.size()];
        int i = 0;
        for (Types.ACTIONS act : actionsList) {
            actions[i++] = act;
        }
    }

    @Override
    public void reset(long seed, int playerID) {
        super.reset(seed, playerID);
        m_rnd = new Random(seed);

        this.params = (MCTSParams) getParameters();
        if (this.params == null) {
            this.params = new MCTSParams();
            super.setParameters(this.params);
        }
    }

    @Override
    public Types.ACTIONS act(GameState gs) {

        // TODO update gs
        if (gs.getGameMode().equals(Types.GAME_MODE.TEAM_RADIO)){
            int[] msg = gs.getMessage();
        }

        ElapsedCpuTimer ect = new ElapsedCpuTimer();
        ect.setMaxTimeMillis(params.num_time);

        // Number of actions available
        int num_actions = actions.length;

        // Root of the tree
        SingleTreeNode m_root = new SingleTreeNode(params, m_rnd, num_actions, actions);
        m_root.setRootGameState(gs);

        //Determine the action using MCTS...
        int numIters = m_root.mctsSearch(ect);
        ss.add(numIters);

        //Determine the best action to take and return it.
        int action = m_root.mostVisitedAction();

        // TODO update message memory


//        Types.TILETYPE[][] ttype = gs.getBoard();
//        for(int i = 0; i < ttype.length; ++i)
//        {
//            for(int j = 0; j < ttype[0].length; ++j)
//            {
//                if(ttype[i][j] == Types.TILETYPE.BOMB)
//                {
//                    int ij = 0;
//                }
//            }
//        }

        //... and return it.
        return actions[action];
    }

    @Override
    public int[] getMessage() {
        // default message
        int[] message = new int[Types.MESSAGE_LENGTH];
        message[0] = 1;
        return message;
    }

    @Override
    public Player copy() {
        return new MCTSPlayer(seed, playerID, params);
    }

    public void result(double reward)
    {
        System.out.println(ss.mean());
    }
}