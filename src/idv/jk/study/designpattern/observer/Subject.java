package idv.jk.study.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bioyang on 2015/10/15.
 */
public abstract class Subject
{
    private String mMessage;
    List<Observer> mObserverList = new ArrayList<Observer>();

    public void add(Observer observer)
    {
        mObserverList.add(observer);
    }

    public void remove(Observer observer)
    {
        mObserverList.remove(observer);
    }

    public void broadcast()
    {
        for(Observer o : mObserverList)
        {
            o.update();
        }
    }

    public String getMessage()
    {
        return mMessage;
    }

    public void setMessage(String message)
    {
        this.mMessage = message;
    }
}
