package idv.jk.fun.mission;

/**
 * Created by bioyang on 2015/10/15.
 */
public class Knight
{
    private ChessBoard mChessBoard;

    public Knight(ChessBoard chessBoard)
    {
        this.mChessBoard = chessBoard;
    }

    public Position moveToNextSteop(Position here)
    {
        Position nextStep = new Position(here.getX() + 2, here.getY() + 1);

        //TODO Refactoring
        if(checkStepValid(nextStep))
        {
            return nextStep;
        }
        nextStep = new Position(here.getX() + 2, here.getY() - 1);
        if(checkStepValid(nextStep))
        {
            return nextStep;
        }
        nextStep = new Position(here.getX() - 2, here.getY() + 1);
        if(checkStepValid(nextStep))
        {
            return nextStep;
        }
        nextStep = new Position(here.getX() - 2, here.getY() - 1);
        if(checkStepValid(nextStep))
        {
            return nextStep;
        }


        nextStep = new Position(here.getX() + 1, here.getY() + 2);
        if(checkStepValid(nextStep))
        {
            return nextStep;
        }
        nextStep = new Position(here.getX() + 1, here.getY() - 2);
        if(checkStepValid(nextStep))
        {
            return nextStep;
        }
        nextStep = new Position(here.getX() + 1, here.getY() + 2);
        if(checkStepValid(nextStep))
        {
            return nextStep;
        }
        nextStep = new Position(here.getX() + 1, here.getY() - 2);
        if(checkStepValid(nextStep))
        {
            return nextStep;
        }
        return null;
    }
    /**
     * 檢查要走的下一步是否為有效。
     * @param position
     * @return
     */
    public boolean checkStepValid(Position position)
    {
        if(position.getX() < 0 || position.getX() >= mChessBoard.getEdgeOfX())
        {
            return false;
        }

        if(position.getY() < 0 || position.getY() >= mChessBoard.getEdgeOfY())
        {
            return false;
        }

        if(mChessBoard.getNumber(position.getX(), position.getY()) != 0)
        {
            return false;
        }
        return true;
    }
}
