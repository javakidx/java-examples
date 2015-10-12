package idv.jk.study.designpattern.memoto;

/**
 * Created by bioyang on 2015/10/12.
 */
public class Programmer
{
    private int hitPoint;
    private int angryPoint;

    private BodyStateMemoto mBodyStateMemoto;

    public BodyStateMemoto saveState()
    {
        return new BodyStateMemoto(this.hitPoint, this.angryPoint);
    }

    public static Programmer beforeWork()
    {
        Programmer programmer = new Programmer();
        programmer.setHitPoint(100);
        programmer.setAngryPoint(0);
        return programmer;
    }

    public void fixBug()
    {
        this.hitPoint -= 5;
        this.angryPoint += 10;
    }

    public void requirementChanged()
    {
        this.hitPoint = 0;
        this.angryPoint = 200;
    }

    public BodyStateMemoto getBodyStateMemoto()
    {
        return new BodyStateMemoto(getHitPoint(), getAngryPoint());
    }

    public void recoverBodyStateMemoto(BodyStateMemoto bodyStateMemoto)
    {
        setHitPoint(bodyStateMemoto.getHitPoint());
        setAngryPoint(bodyStateMemoto.getAngryLevel());
    }

    public int getHitPoint()
    {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint)
    {
        this.hitPoint = hitPoint;
    }

    public int getAngryPoint()
    {
        return angryPoint;
    }

    public void setAngryPoint(int angryPoint)
    {
        this.angryPoint = angryPoint;
    }


}
