package idv.jk.study.designpattern.state;

/**
 * Created by bioyang on 2015/10/14.
 */
public class Main
{
    public static void main(String[] args)
    {
        Developer giantBear = new Developer("大熊");
        giantBear.sayWhatAreThinkingNow();

        giantBear.setHour(9);
        giantBear.sayWhatAreThinkingNow();

        giantBear.setHour(12);
        giantBear.sayWhatAreThinkingNow();

        giantBear.setHour(13);
        giantBear.sayWhatAreThinkingNow();

        giantBear.setHour(18);
        giantBear.sayWhatAreThinkingNow();
    }
}
