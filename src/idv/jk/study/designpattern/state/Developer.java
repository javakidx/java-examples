package idv.jk.study.designpattern.state;

/**
 * Created by bioyang on 2015/10/14.
 */
public class Developer
{
    public Developer(String name)
    {
        this.name = name;
        this.mMoodSate = new MorningSate();
        this.hour = 8;
    }

    private String name;
    private MoodState mMoodSate;

    private int hour;

    public void sayWhatAreThinkingNow()
    {
        System.out.println(name + " 現在的心情：" + getMoodStateInWord());
    }

    public String getMoodStateInWord()
    {
        return this.mMoodSate.getMood(this);
    }

    public Developer changeMood(MoodState moodSate)
    {
        this.mMoodSate = moodSate;
        return this;
    }

    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }
}
