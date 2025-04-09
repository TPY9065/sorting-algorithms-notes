package bubblesort;

import utils.Utility;

public class BubbleSort
{
    public static void main(String[] args)
    {
        BubbleSort bubbleSort = new BubbleSort();

        int[] values = new int[]{ 35, 33, 42, 10, 14, 19, 27, 44, 26, 31 };
        bubbleSort.sort(values);

        Utility.println(values);
    }

    public void sort(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            for (int j = 0; j < values.length - i - 1; j++)
            {
                if (values[j] > values[j + 1])
                {
                    Utility.swap(values, j, j + 1);
                }
            }
            Utility.println(values);
        }
    }
}
