package players.mcts;

public class PommermanRules {
    public boolean updateFlames = true;
    public boolean updateBombs = true;
    public boolean updatePositionSwap = true;
    public boolean updatePositionOverlap = true;
    public boolean updateMovingBombs = true;
    public boolean updatePowerUps = true;
    public boolean updateCollapse = true;
    public boolean alwaysUpdateTrueModel = true;
    public boolean updateExplosions = true;
    public int threshold = 1;

    public boolean delayFlames = true;
    public boolean delayBombs = true;
    public boolean delayPositionSwap = true;
    public boolean delayPositionOverlap = true;
    public boolean delayMovingBombs = true;
    public boolean delayExplosions = true;

    public long delayMillis = 0;
    public int delayNanos = 100;


    public PommermanRules(){}

    public PommermanRules copy()
    {
        PommermanRules copy = new PommermanRules();
        copy.updateFlames = updateFlames;
        copy.updateBombs = updateBombs;
        copy.updatePositionSwap = updatePositionSwap;
        copy.updatePositionOverlap = updatePositionOverlap;
        copy.updateMovingBombs = updateMovingBombs;
        copy.updatePowerUps = updatePowerUps;
        copy.updateCollapse = updateCollapse;
        copy.alwaysUpdateTrueModel = alwaysUpdateTrueModel;
        copy.updateExplosions = updateExplosions;
        copy.threshold = threshold;

        copy.delayFlames = delayFlames;
        copy.delayBombs = delayBombs;
        copy.delayPositionSwap = delayPositionSwap;
        copy.delayPositionOverlap = delayPositionOverlap;
        copy.delayMovingBombs = delayMovingBombs;
        copy.delayExplosions = delayExplosions;

        copy.delayMillis = delayMillis;
        copy.delayNanos = delayNanos;

        return copy;
    }


}
