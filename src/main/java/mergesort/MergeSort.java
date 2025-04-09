package mergesort;

import utils.Utility;

import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        int[] values = new int[]{ 56, 29, 35, 42, 15, 41, 75, 21 };

        MergeSort mergeSort = new MergeSort();
        int[] sorted = mergeSort.sort(values);

        Utility.println(sorted);
    }

    public int[] sort(int[] values)
    {
        if (values.length <= 1)
        {
            return values;
        }

        int[] left = sort(Arrays.copyOfRange(values, 0, values.length / 2));
        int[] right = sort(Arrays.copyOfRange(values, values.length / 2, values.length));

        System.out.print("left: ");
        Utility.print(left);
        System.out.print(" right: ");
        Utility.print(right);

        int li = 0;
        int ri = 0;
        int[] sorted = new int[values.length];
        while (li + ri < values.length)
        {
            if (li >= left.length)
            {
                sorted[li + ri] = right[ri];
                ri += 1;
            }
            else if (ri >= right.length)
            {
                sorted[li + ri] = left[li];
                li += 1;
            }
            else if (left[li] < right[ri])
            {
                sorted[li + ri] = left[li];
                li += 1;
            }
            else
            {
                sorted[li + ri] = right[ri];
                ri += 1;
            }
        }
        System.out.print(" merged: ");
        Utility.println(sorted);

        return sorted;
    }
}
