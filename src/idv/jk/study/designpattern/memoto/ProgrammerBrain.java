package idv.jk.study.designpattern.memoto;

/**
 * Created by bioyang on 2015/10/12.
 */
public class ProgrammerBrain
{
    private BodyStateMemoto mBodyStateMemoto;

    public void setBodyStateMemoto(BodyStateMemoto bodyStateMemoto)
    {
        this.mBodyStateMemoto = bodyStateMemoto;
    }

    public BodyStateMemoto getBodyStateMemoto()
    {
        return mBodyStateMemoto;
    }
}
