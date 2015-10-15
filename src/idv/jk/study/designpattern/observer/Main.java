package idv.jk.study.designpattern.observer;

/**
 * Created by bioyang on 2015/10/15.
 */
public class Main
{
    public static void main(String[] args)
    {
        //Shaun the sheep中的那隻牧羊犬
        SheepDog bitzer = new SheepDog();

        //chief actor
        Sheep shaun = new Sheep("Shaun", bitzer);

        //Shaun's cousin, is the flock's only lamb,
        Sheep timmy = new Sheep("Timmy", bitzer);

        //Shirley is the largest member of the flock
        Sheep shirley = new Sheep("Shirley", bitzer);

        //Nuts, is quite an eccentric, but useful sheep and usually like the rest of the flock, accompanies and helps Shaun.
        Sheep nuts = new Sheep("Nuts", bitzer);

        bitzer.setMessage("主人回來了，快點恢復正常羊的樣子");
        bitzer.broadcast();

        System.out.println("晚上了...");
        //晚上了，Timmy比較早睡，Bitzer就不通知他
        bitzer.remove(timmy);
        bitzer.setMessage("星星出來了，大家快來看啊");
        bitzer.broadcast();
    }
}
