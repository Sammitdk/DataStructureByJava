package Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort
{
    public static void main(String[] args)
    {
        int[] arr = {4,2,5,3,1};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
    public static int[] cyclicSort(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correctIndex = arr[i] -1 ;
            if(arr[correctIndex] != arr[i])
            {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else
            {
                i++;
            }
        }
        return arr;
    }
}
