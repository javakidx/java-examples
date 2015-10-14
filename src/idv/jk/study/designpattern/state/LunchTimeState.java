package idv.jk.study.designpattern.state;

/**
 * Created by bioyang on 2015/10/14.
 */
public class LunchTimeState extends MoodState
{
    @Override
    public String getMood(Developer developer)
    {
        if(developer.getHour() < 13)
        {
            return "要吃午餐了，可以輕鬆一下";
        }

        return developer.changeMood(new AfternoonState()).getMoodStateInWord();
    }
}
