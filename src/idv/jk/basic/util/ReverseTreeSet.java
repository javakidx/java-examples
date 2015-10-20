package idv.jk.basic.util;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by bioyang on 2015/10/20.
 */
public class ReverseTreeSet
{
    public static void main(String[] args)
    {
        System.out.println("順序：");
        Set<String> set1 = new TreeSet<>();
        set1.add("Bio");
        set1.add("Young");
        set1.add("javakid");

        for(String s : set1)
        {
            System.out.println(s);
        }

        System.out.println("倒序：");
        set1 = new TreeSet<>(Collections.reverseOrder());
        set1.add("Bio");
        set1.add("Young");
        set1.add("javakid");

        for(String s : set1)
        {
            System.out.println(s);
        }
    }
}
