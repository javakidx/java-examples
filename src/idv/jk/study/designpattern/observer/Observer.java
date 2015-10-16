package idv.jk.study.designpattern.observer;

/**
 * Created by bioyang on 2015/10/15.
 */
public abstract class Observer
{
    protected String mName;
    protected Subject mSubject;

    public abstract void update();
}