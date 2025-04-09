package quicksort;

import utils.Utility;

public class QuickSort
{
    public static void main(String[] args)
    {
        QuickSort quickSort = new QuickSort();

        int[] values = new int[]{ 35, 33, 42, 10, 14, 19, 27, 44, 26, 31 };
        quickSort.sort(values, 0, values.length - 1);

        Utility.println(values);
    }

    public void sort(int[] values, int left, int right)
    {
        if (left >= right)
        {
            return;
        }

        // choose pivot
        int pivot = values[right];

        // init li and ri which points to the first and the last value, except pivot
        int li = left;
        int ri = right - 1;

        // compare `li` and `ri` with pivot
        while (li <= ri)
        {
            if (values[li] > pivot && values[ri] < pivot)
            {
                Utility.swap(values, li, ri);
                li += 1;
                ri -= 1;
                continue;
            }

            if (values[li] <= pivot)
            {
                li += 1;
            }

            if (values[ri] >= pivot)
            {
                ri -= 1;
            }
        }

        // swap li and pivot as we choose the last index as pivot
        Utility.swap(values, li, right);
        Utility.println(values);

        // repeat sorting on sub-arrays
        sort(values, left, li - 1);
        sort(values, li + 1, right);
    }
}
