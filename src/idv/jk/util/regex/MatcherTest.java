package idv.jk.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by uncle.yang on 2015/4/23.
 */
public class MatcherTest
{
    public static void main(String[] arv)
    {
        String input = "1990Mar02Taipei28\r\n1991March03Tainan35";
        Pattern pattern = Pattern.compile("(\\d+)(\\D+)(\\d+)(\\D+)(\\d+)",
                                            Pattern.MULTILINE);

        Matcher matcher = pattern.matcher(input);

        while(matcher.find())
        {
            System.out.println("The value at " + matcher.group(4) +
                                    " in " + matcher.group(2) +
                                    " " + matcher.group(1)+
                                    " is " + matcher.group(5));
        }
    }
}

 
