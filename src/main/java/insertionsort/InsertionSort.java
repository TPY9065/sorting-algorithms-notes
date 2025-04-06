package insertionsort;

import utils.Utility;

public class InsertionSort
{
    public static void main(String[] args)
    {
        InsertionSort insertionSort = new InsertionSort();

        int[] values = new int[]{ 17, 54, 23, 77, 93, 31, 44, 55, 20 };
        insertionSort.sort(values);
        System.out.print("Results: ");
        Utility.print(values);
    }

    public void sort(int[] values)
    {
        // the index used to track which value we want to move/insert in this step
        for (int i = 0; i < values.length; i++)
        {
            // values[0...j] is the sorted part in the original values
            System.out.printf("value to move: %d\n", values[i]);
            for (int j = 0; j < i; j++)
            {
                if (values[i] < values[j])
                {
                    insertAndShift(values, i, j);
                }
            }
            Utility.print(values);
            System.out.println();
        }
    }

    // as this method is only used in this sort, insertion sort
    // I will just consider move value at the back to the front and shift the remaining values to the back
    private void insertAndShift(int[] values, int from, int to)
    {
        int valueToMove = values[from];
        for (int i = from - 1; i >= to; i--)
        {
            values[i + 1] = values[i];
        }
        values[to] = valueToMove;
    }
}
