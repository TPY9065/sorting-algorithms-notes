package utils;

import java.util.Arrays;

public class Utility
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
}
