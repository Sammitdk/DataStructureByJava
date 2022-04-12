package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {50,10,44,2,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    public static int[] selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++)
        {
            int end = arr.length-i-1;
            solution(arr,0,end);
        }
        return arr;
    }
    public static void solution(int[] arr, int start, int end)
    {
        int max = start;
        for (int i = start+1; i <= end; i++)
        {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
     }
}
