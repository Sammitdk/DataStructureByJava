//We are searching elements in a mountain array by binary search.
package Binarysearch;
public class MountainArraySearch
{
    public static int mountainSearch(int[] arr,int target)
    {
        //taken the peak element
        int peak = peekElement(arr);
        //tring both the left and right side of peek
        int Ascendingtry = ascendingDescending(arr,target,0,peak);
        if(Ascendingtry != -1)
        {
            return Ascendingtry;
        }
        else
        {
            return ascendingDescending(arr,target,peak++,arr.length-1);
        }
    }
    public static int ascendingDescending(int[] arr, int target,int start,int end)
    {
        // find whether the array is sorted in ascending or descending
        boolean b = arr[start] < arr[end];
        while (start <= end)
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
    public static int peekElement(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start < end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,8,7,6,5,1};
        int target = 1;
        System.out.println(mountainSearch(arr,target));
    }
}
