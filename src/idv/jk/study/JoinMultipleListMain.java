package idv.jk.study;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by bioyang on 2015/10/28.
 */
public class JoinMultipleListMain
{
    public static void main(String[] args)
    {
        List<String> numberList = Arrays.asList("1", "2", "3");
        List<String> alphabetList = Arrays.asList("a", "b", "c", "d");
        List<String> symbolicList = Arrays.asList(".", "/", "|", "@");

        Queue<List<String>> theQueue = new LinkedList<>(Arrays.asList(numberList, alphabetList, symbolicList));

        List<String> newStringList = JoinMultipleListMain.joinStringPeice(theQueue.poll(), theQueue);
        for (String s : newStringList)
        {
            System.out.print(s + "\t");
        }
    }

    public static List<String> joinStringPeice(List<String> stringList1,  Queue<List<String>> listQueue)
    {
        List<String> newStringList = new ArrayList<>();
        if(listQueue.isEmpty())
        {
            return stringList1;
        }
        List<String> thisList = listQueue.poll();
        String tempA;
        for (Iterator<String> it = stringList1.iterator(); it.hasNext();)
        {
            tempA = it.next();
            for (Iterator<String> it2 = thisList.iterator(); it2.hasNext();)
            {
                newStringList.add(tempA + it2.next());
            }
        }

        if(thisList.isEmpty())
        {
            return newStringList;
        }
        return joinStringPeice(newStringList, listQueue);
    }
}
