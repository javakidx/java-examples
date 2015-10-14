package idv.jk.study.designpattern.state;

/**
 * Created by bioyang on 2015/10/14.
 */
public class Main
{
    public static void main(String[] args)
    {
        //新的一天開始的大熊
        Developer giantBear = new Developer("大熊");
        //來看他的心情如何
        giantBear.sayWhatAreThinkingNow();

        //到了九點的大熊
        giantBear.setHour(9);
        giantBear.sayWhatAreThinkingNow();

        //到了中午吃飯時間
        giantBear.setHour(12);
        giantBear.sayWhatAreThinkingNow();

        //午休結束，開始上班
        giantBear.setHour(13);
        giantBear.sayWhatAreThinkingNow();

        //下班了
        giantBear.setHour(18);
        giantBear.sayWhatAreThinkingNow();
    }
}
