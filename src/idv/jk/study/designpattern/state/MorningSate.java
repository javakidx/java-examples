package idv.jk.study.designpattern.state;

/**
 * Created by bioyang on 2015/10/14.
 */
public class MorningSate extends MoodState
{
    @Override
    public String getMood(Developer developer)
    {
        if(developer.getHour() < 9)
        {
            return "正式享受美好的早餐，心情還不錯";
        }
        else if(developer.getHour() < 12)
        {
            return "打起精神，努力工作";
        }
        return developer.changeMood(new LunchTimeState()).getMoodStateInWord();
    }
}
