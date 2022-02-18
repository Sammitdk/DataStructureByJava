package Binarysearch;
public class RotatedBS
{
    public static int rotatedBinarySearch(int[] arr,int target,int start,int end)
    {
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[start]<=arr[mid])
            {
                if (target>=arr[start] && target <= arr[mid])
                {
                    return rotatedBinarySearch(arr, target, start, mid - 1);
                }
                else
                {
                    return rotatedBinarySearch(arr, target, mid++, arr.length - 1);
                }
            }
            if(target>=arr[mid] && target<=arr[end])
            {
                return rotatedBinarySearch(arr, target, mid++, arr.length - 1);
            }
        }
        return rotatedBinarySearch(arr,target,0,arr.length-1);
    }
    public static void main(String[] args)
    {
        int[] arr = {10,13,15,17,18,20,0,1,2,4};
        int target = 2;
        System.out.println(rotatedBinarySearch(arr,target,0,arr.length-1));
    }
}
