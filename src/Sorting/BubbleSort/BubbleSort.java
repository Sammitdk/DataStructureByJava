package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {5,3,7,6,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(bubbleSort1(arr)));
    }
    public static int[] bubbleSort(int[] arr)
    {
        boolean swap = false;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 1; j < arr.length-i ; j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = 0;
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            //if the array is sorted
            if(!swap)
            {
                break;
            }
        }
        return arr;
    }
    public static int[] bubbleSort1(int[] arr)
    {
        int end = arr.length-1;
        boolean swap = false;
        while(end > 0)
        {
            for(int i=0;i<end;i++)
            {
                if (arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap = true;
                }
            }
            end--;
            if(!swap)
            {
                break;
            }
        }
        return arr;
    }
}
