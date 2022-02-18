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
        int arr[] = {4,5,6,7,8,9,3,2,1};
        System.out.println(mountainArray(arr));
    }
}
