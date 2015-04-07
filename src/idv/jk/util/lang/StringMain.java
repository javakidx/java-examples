package idv.jk.util.lang;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;

/**
 * Created by bioyang on 15/4/7.
 */
public class StringMain
{
    public static void main(String[] argvs)
    {
        String input = "1,2,,4,5,";
        String[] peices = input.split(",");
        System.out.println("字串陣列的長度為: " + peices.length);
        System.out.print("字串陣列內的元素為: ");
        System.out.print(Arrays.asList(peices));
        System.out.println();
        split();
    }

    public boolean checkInput(String input)
    {
        if(input != null || input.equals(""))

        //OR
        if("".equals(input))
        {

        }

        if(StringUtils.isEmpty(input))
        {

        }
        //StringUtils.isEmpty(null) 回傳true
        //StringUtils.isEmpty("")   回傳true
        //StringUtils.isEmpty(" ")  回傳false
        return true;
    }

    public static void split()
    {
        String input = "1,2,,4,5,";
        String[] peices = StringUtils.splitByWholeSeparatorPreserveAllTokens(input, ",");
        System.out.println("字串陣列的長度為: " + peices.length);
        System.out.print("字串陣列內的元素為: ");
        System.out.print(Arrays.asList(peices));
    }
}
