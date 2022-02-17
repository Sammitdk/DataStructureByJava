package Binarysearch;
public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {-10,-8, -4, 0, 2, 3, 5, 18, 20, 21, 22, 45, 89};
        int target = 45;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}