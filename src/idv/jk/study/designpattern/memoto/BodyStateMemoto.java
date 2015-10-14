package idv.jk.study.designpattern.memoto;

/**
 * Created by bioyang on 2015/10/12.
 */
public class BodyStateMemoto
{
    /**
     * 生命力
     */
    private int hitPoint;
    /**
     * 憤怒值
     */
    private int angryLevel;

    public BodyStateMemoto(int hitPoint, int angryLevel)
    {
        this.hitPoint = hitPoint;
        this.angryLevel = angryLevel;
    }

    public int getHitPoint()
    {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint)
    {
        this.hitPoint = hitPoint;
    }

    public int getAngryLevel()
    {
        return angryLevel;
    }

    public void setAngryLevel(int angryLevel)
    {
        this.angryLevel = angryLevel;
    }
}