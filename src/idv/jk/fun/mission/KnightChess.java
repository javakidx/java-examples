package idv.jk.fun.mission;

/**
 * Created by bioyang on 2015/10/15.
 */
public class KnightChess
{
    public static void main(String[] args)
    {
        ChessBoard board = new ChessBoard();
        Knight knight = new Knight(board);

        Position nowPosition = new Position(0, 0);

        if(!knight.checkStepValid(nowPosition))
        {
            System.out.printf("起點[%d, %d]位置有誤", nowPosition.getX(), nowPosition.getY());
            return;
        }
        for(int k = 1; k <= 64; k++ )
        {
            board.mark(nowPosition.getX(), nowPosition.getY(), k);
            nowPosition = knight.moveToNextSteop(nowPosition);

            if(nowPosition == null)
            {
                break;
            }
        }

        for(int[] row : board.getChessBoard())
        {
            for(int square : row)
            {
                System.out.printf("%d ", square);
            }
            System.out.println();
        }
    }
}
