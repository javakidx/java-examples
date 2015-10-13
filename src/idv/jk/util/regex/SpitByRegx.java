package idv.jk.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 安軻 on 2015/6/16.
 */
public class SpitByRegx
{
    public static void main(String[] args)
    {
        String input = "1950/00/00;1953/00/00;1958/00/00;1960/00/00;1962/0";

        Pattern pattern = Pattern.compile("([0-9/]+);?");

        Matcher m = pattern.matcher(input);

        while(m.find())
        {
            System.out.println(m.group(1));
        }
    }
}
