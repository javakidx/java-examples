package idv.jk.fun;

public class SnakesAndLadders
{
    private static final int finalSquare = 25;

    public static void main(String[] args)
    {
        int[] board = new int[finalSquare + 1];

        for(int i = 0; i <= finalSquare; i++)
        {
            board[i] = 0;
        }

        //定義走到的格子要上樓梯或滑下蛇後，要前進或後退幾格
        board[3] = +8;
        board[6] = +11;
        board[9] = +9;
        board[10] = +2;

        board[14] = -10;
        board[19] = -11;
        board[22] = -2;
        board[24] = -8;


        int diceNumber = 0;//擲出的點數

        int step = 0; //走到第幾格

        while(step < finalSquare)
        {
            //擲骰子
            diceNumber = (int)(Math.random() * 6 + 1);
            System.out.print("擲出的點數: " + diceNumber + ", ");
            step += diceNumber;

            if(step < board.length)
            {
                if(board[step] > 0)
                {
                    System.out.print("上樓梯, 爬上 " + board[step] + " 格, ");
                }
                else if(board[step] < 0)
                {
                    System.out.print("下蛇身, 滑下 " + board[step] + " 格, ");
                }
                step += board[step];
            }
            System.out.println("前進到第 " + step + " 格");
        }
        System.out.println("結束");
    }
}
