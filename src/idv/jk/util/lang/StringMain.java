package idv.jk.util.lang;

import org.apache.commons.lang.StringUtils;

/**
 * Created by bioyang on 15/4/7.
 */
public class StringMain
{
    public static void main(String[] argvs)
    {
        String input = "";
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
}
