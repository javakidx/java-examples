package idv.jk.util.lang;

/**
 * Created by javakid on 4/2/15.
 */
public class LongUtils
{
    /**
     * 將傳入的一個長整數，以一個數字一個數字切成一個字元陣列。
     * @param number  要切成字元陣列的長整數
     * @return 結果字元陣列
     */
    public static char[] spitLongToCharArray(long number)
    {
        String strNumber = String.valueOf(number);
        int length = strNumber.length();
        char[] results = new char[length];
        for(int i = 0; i < length; i++)
        {
            results[i] = strNumber.charAt(i);

        }
        return results;
    }

    //test
    public static void main(String[] args)
    {
        char results[] = spitLongToCharArray(12345678L);

        System.out.println("length: " + results.length);
        for(int i = 0; i < results.length; i++)
        {
            System.out.print(results[i] + ",");
        }
    }
}
