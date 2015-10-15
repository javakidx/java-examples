package idv.jk.fun.mission;

/**
 * Created by bioyang on 2015/10/15.
 */
public class ChessBoard
{
    private int[][] mChessBoard = new int[8][8];

    public int[][] getChessBoard()
    {
        return mChessBoard;
    }

    public int getEdgeOfX()
    {
        return mChessBoard.length;
    }

    public int getEdgeOfY()
    {
        return mChessBoard[0].length;
    }

    public void mark(int x, int y, int number)
    {
        mChessBoard[x][y] = number;
    }

    public int getNumber(int x, int y)
    {
        return mChessBoard[x][y];
    }
}
