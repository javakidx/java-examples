package idv.jk.study.designpattern.state;

/**
 * Created by bioyang on 2015/10/14.
 */
public class AfternoonState extends MoodState
{
    @Override
    public String getMood(Developer developer)
    {
        if(developer.getHour() < 18)
        {
            return "下午雖然有點想睡，但還牙咬一下就過了，XD";
        }
        return developer.changeMood(new AfterWorkState()).getMoodStateInWord();
    }
}
