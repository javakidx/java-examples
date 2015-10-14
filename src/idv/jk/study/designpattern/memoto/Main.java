package idv.jk.study.designpattern.memoto;

/**
 * Created by bioyang on 2015/10/12.
 */
public class Main
{
    public static void main(String[] args)
    {
        //有一個叫小明的工程師
        Programmer smallMing = Programmer.beforeWork();
        //他在上班前的身心狀態
        System.out.printf("開始工作前的HP為 %d, 憤怒條為 %d\r\n",
                            smallMing.getHitPoint(), smallMing.getAngryPoint());

        //為了確認明天是全新的一天，他的大腦要把上班前的狀態給記下來
        ProgrammerBrain brainOfSmallMing = new ProgrammerBrain();
        brainOfSmallMing.setBodyStateMemoto(smallMing.getBodyStateMemoto());

        //小明修了一個Bug
        smallMing.fixBug();
        //這對他的身心狀態沒有太大的影響
        System.out.printf("修了一個Bug的HP為 %d, 憤怒條為 %d\r\n",
                            smallMing.getHitPoint(), smallMing.getAngryPoint());

        //客戶改了需求
        smallMing.requirementChanged();
        //要殺死一個工程師，只要改一個需求
        System.out.printf("知道客戶改了需求後的HP為 %d, 憤怒條為 %d\r\n",
                            smallMing.getHitPoint(), smallMing.getAngryPoint());

        //但一天過去了，又是美好、新的一天
        smallMing.recoverBodyStateMemoto(brainOfSmallMing.getBodyStateMemoto());
        System.out.printf("隔天起床工作前的HP為 %d, 憤怒條為 %d\r\n",
                            smallMing.getHitPoint(), smallMing.getAngryPoint());
    }
}
