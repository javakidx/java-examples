package idv.jk.util.lang;

/**
 * Created by javakid on 4/2/15.
 */
public class LongUtils
{
    public static int[] spitLongToIntArray(long inNumber)
    {
        String strNumber = String.valueOf(inNumber);

        int length = strNumber.length();
        int[] results = new int[length];

        for(int i = 0; i < length; i++)
        {
            results[i] = Character.getNumericValue( strNumber.charAt(i) );
        }

        return results;
    }

    //test
    public static void main(String[] argv)
    {
        for(int i : spitLongToIntArray(-5678))
        {
            System.out.print(i + ",");
        }
    }
}
