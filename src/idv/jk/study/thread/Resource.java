package idv.jk.study.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 良葛格Java SE8 技術手冊中的範例。
 *
 * Created by bioyang on 2015/10/18.
 */
public class Resource
{
    private ReentrantLock mLock = new ReentrantLock();
    private String name;

    public Resource(String name)
    {
        this.name = name;
    }

    public void cooperate(Resource resource)
    {
        try
        {
            while (true)
            {
                if (lockMeAnd(resource))
                {
                    System.out.printf("%s 整合 %s 的資源%n", this.name, resource.name);
                    break;
                }
            }
        }
        finally
        {
            unLockMeAnd(resource);
        }
    }

    public boolean lockMeAnd(Resource resource)
    {
        return mLock.tryLock() && resource.mLock.tryLock();
    }

    public void unLockMeAnd(Resource resource)
    {
        if (this.mLock.isHeldByCurrentThread())
        {
            this.mLock.unlock();
        }

        if(resource.mLock.isHeldByCurrentThread())
        {
            resource.mLock.unlock();
        }
    }
}
