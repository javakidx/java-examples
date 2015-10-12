package idv.jk.study.algorithm.sort;

import java.util.Scanner;

/**
 * Created by bioyang on 15/9/22.
 */
public class BubbleSort
{
    public static void main(String[] args)
    {
        int scores[] = new int[100];
        int size;
        System.out.println("輸入分數的總數...");
        Scanner scanner = new Scanner(System.in);

        size = scanner.nextInt();

        System.out.println("輸入分數(用,隔開)...");
        String strNumbers = scanner.next();

        String numbers[] = strNumbers.split(",");

        //把輸入的數字存入到陣列中
        for(int i = 0; i < numbers.length; i++)
        {
            scores[i] = Integer.parseInt(numbers[i]);
        }

        int temp;   //於大小比對時暫存數字的變數

        //開始對所有數字做排列
        for(int i = 0; i < size; i++)
        {
            //size - i表第2次只要比對size-1個數字，
            // 第3次只要比對size-2個數字，以此類推
            for (int j = 0; j < size - i; j++)
            {
                //由小至大，兩兩比對做數字交換
                if (scores[j] < scores[j+1])
                {
                    temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
                }
            }
        }

        //印出結果
        for(int i = 0; i < size; i++)
        {
            System.out.printf("%d ", scores[i]);
        }
    }
}
