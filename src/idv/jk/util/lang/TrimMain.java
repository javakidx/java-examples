package idv.jk.util.lang;

import java.util.regex.Pattern;

/**
 * Created by bioyang on 15/4/9.
 */
public class TrimMain
{
    public static void main(String[] argv)
    {
        String oldString = " Hello\t\tHello\r\nWorld";
        System.out.println(oldString);
//        String newString = oldString.replaceAll(" ", "");
//        System.out.println(newString);

        String newString = oldString.replaceAll("\\s+", "");
        System.out.println(newString);
        m1();
    }

    public static void m1()
    {
        String oldString = " Hello\t\tHello\r\nWorld";
        String newString = Pattern.compile("\\s+").matcher(oldString).replaceAll("");
        System.out.println(newString);
    }
}
