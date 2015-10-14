package idv.jk.study.algorithm.sort;

/**
 * Created by bioyang on 2015/10/10.
 */
public class QuickSort
{
    public static void main(String[] args)
    {
        int[] numberArray = new int[]{6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        new QuickSort().quickSort(0, numberArray.length - 1, numberArray);

        for(int n : numberArray)
        {
            System.out.print(n + "\t");
        }
    }

    /**
     *
     * @param left 最左邊那個數字的index
     * @param right 最右邊那個數字的index
     * @param numberArray 要排序的整數陣列
     */
    public void quickSort(int left, int right, int[] numberArray)
    {
        if(left > right)
        {
            //代表排序已結束
            return;
        }
        int startIndex = left; //代表最左邊那個數字的起始index
        int endIndex = right;   //代表最右邊那個數字的起始index
        int baseValue = numberArray[left]; //用來儲存要排序的數字陣列最左邊的數字
        int temp;   //用來暫存交換時的值

        while (startIndex != endIndex)
        {
            //要先從右往左找
            while (numberArray[endIndex] >= baseValue && startIndex < endIndex)
            {
                endIndex--;
            }

            while (numberArray[startIndex] <= baseValue && startIndex < endIndex)
            {
                startIndex++;
            }

            if (startIndex < endIndex)
            {
                temp = numberArray[startIndex];
                numberArray[startIndex] = numberArray[endIndex];
                numberArray[endIndex] = temp;
            }
        }

        numberArray[left] = numberArray[startIndex];
        numberArray[startIndex] = baseValue;

        //這裡會叫用遞迴，想起有次聽到良葛格說；「遞迴只應天上有，人間只能用迴圈」，XD
        //將原本最左邊的數字歸位後，開始排序以比這個數小的那群數字
        quickSort(left, startIndex - 1, numberArray);
        //將原本最左邊的數字歸位後，開始排序以比這個數大的那群數字
        quickSort(startIndex + 1, right, numberArray);

    }
}
