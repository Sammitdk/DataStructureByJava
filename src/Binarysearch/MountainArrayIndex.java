package Binarysearch;
public class MountainArrayIndex
{
    public static int mountainArray(int[] arr)
    {
        int start = 0;
        int end = arr.length -1;
        while(start<end)
        {
            int mid = (start + (end-start)/2);
            if(arr[mid]>arr[mid+1])
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
        int arr[] = {1,2,6,7,4,5,4,2};
        System.out.println(mountainArray(arr));
    }
}
