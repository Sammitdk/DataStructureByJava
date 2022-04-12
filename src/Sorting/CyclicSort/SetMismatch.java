package Sorting.CyclicSort;

import java.util.Arrays;

public class SetMismatch
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(setMismatch(arr)));
    }
    public static int[] setMismatch(int[] arr)
    {
        int i =0;
        while(i<arr.length)
        {
            int correct = arr[i] - 1 ;
            if(arr[correct] != arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[correct] ;
                arr[correct] = temp ;
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] != i+1)
            {
                return new int[] {arr[i],i+1};
            }
        }
        return new int[] {-1,-1};
    }
}
