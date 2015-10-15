package idv.jk.study.designpattern.observer;

/**
 * Created by bioyang on 2015/10/15.
 */
public class Sheep extends Observer
{
    public Sheep(String name, Subject subject)
    {
        this.mName = name;
        this.mSubject = subject;
        subject.add(this);
    }

    @Override
    public void update()
    {
        System.out.printf("通知 %s：%s%n", mName, mSubject.getMessage());
    }
}