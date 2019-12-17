package players.mcts;

public class PommermanRules {
    public boolean updateFlames = true;
    public boolean updateBombs = true;
    public boolean updatePositionSwap = true;
    public boolean updatePositionOverlap = true;
    public boolean updateMovingBombs = true;
    public boolean lateUpdate = true;
    public boolean updatePowerUps = true;
    public boolean updateCollapse = true;
    public boolean alwaysUpdateTrueModel = true;
    public int threshold = -1;


    public boolean delayFlames = false;
    public boolean delayBombs = false;
    public boolean delayPositionSwap = false;
    public boolean delayPositionOverlap = false;
    public boolean delayMovingBombs = false;
    public boolean lateUpdateDelay = false;
    public boolean delayPowerUps = false;
    public boolean delayCollapse = false;
    public boolean delayExplosions = false;

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
        copy.lateUpdate = lateUpdate;
        copy.updatePowerUps = updatePowerUps;
        copy.updateCollapse = updateCollapse;
        copy.alwaysUpdateTrueModel = alwaysUpdateTrueModel;
        copy.threshold = threshold;

        copy.delayFlames = delayFlames;
        copy.delayBombs = delayBombs;
        copy.delayPositionSwap = delayPositionSwap;
        copy.delayPositionOverlap = delayPositionOverlap;
        copy.delayMovingBombs = delayMovingBombs;
        copy.lateUpdateDelay = lateUpdateDelay;
        copy.delayPowerUps = delayPowerUps;
        copy.delayCollapse = delayCollapse;
        copy.delayExplosions = delayExplosions;

        copy.delayMillis = delayMillis;
        copy.delayNanos = delayNanos;

        return copy;
    }


}
