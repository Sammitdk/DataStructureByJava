package Binarysearch;
public class ArrayLargestSum
{
    public static void main(String[] args)
    {
        int[] arr = {7,2,5,10,8};
        System.out.println(largestSumInArray(arr,2));
    }
    public static int largestSumInArray(int[] arr,int m)
    {
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>start)
            {
                start = arr[i];
            }
            end = end + arr[i];
        }
        while (start<end)
        {
            int mid = (start)+(end-start)/2;
            int count = 1;
            int sum =0;
            for(int num:arr)
            {
                if(sum+num>mid)
                {
                    sum = num;
                    count++;
                }
                else
                {
                    sum = sum + num;
                }
            }
            if(count>m)
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return end;
    }
}
