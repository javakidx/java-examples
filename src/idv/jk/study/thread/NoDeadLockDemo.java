package idv.jk.study.thread;

/**
 * 良葛格Java SE8 技術手冊中的範例。
 *
 * Created by bioyang on 2015/10/18.
 */
public class NoDeadLockDemo
{
    public static void main(String args[] )
    {
        Resource resource1 = new Resource("resource1");
        Resource resource2 = new Resource("resource2");

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
            {
                resource1.cooperate(resource2);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
            {
                resource2.cooperate(resource1);
            }
        });

        thread1.start();
        thread2.start();
    }
}
