package Binarysearch;
public class AscendingDescendingSearch
{
    public static void main(String[] args)
    {
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        System.out.println(ascendingDescending(arr, target));
    }
    public static int ascendingDescending(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        // find whether the array is sorted in ascending or descending
        boolean b = arr[start] < arr[end];
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
            {
                return mid;
            }
            if (b)
            {
                if (target < arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else
            {
                if (target > arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
