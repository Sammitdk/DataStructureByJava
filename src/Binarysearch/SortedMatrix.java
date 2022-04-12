package Binarysearch;
import java.util.Arrays;
public class SortedMatrix
{
    public static int[] sortedMatrix(int[][] arr,int target)
    {
        int start = 0;
        int end = arr[0].length-1;
        while(start<arr.length && end>=0)
        {
            int mid = start + (end-start)/2;
            if(arr[start][mid]==target)
            {
                return new int[] {start,mid};
            }
            if(arr[start][mid]<target)
            {
                mid = end + 1;
            }
            else
            {
                mid = start + 1;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args)
    {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        int target = 3;
        System.out.println(Arrays.toString(sortedMatrix(arr,target)));
    }
}

