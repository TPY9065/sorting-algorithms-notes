package selectionsort;

import utils.Utility;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] values = new int[]{ 41, 33, 17, 80, 61, 5, 55 };
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(values);
        Utility.print(values);
    }

    public void sort(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            int minIndex = i;
            for (int j = i; j < values.length; j++)
            {
                minIndex = values[minIndex] < values[j] ? minIndex : j;
            }
            Utility.swap(values, minIndex, i);
            Utility.print(values);
        }
    }
}
