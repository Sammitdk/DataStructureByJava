package Binarysearch;
public class RotatedDuplicateBS
{
    public static int search(int[] arr,int target)
    {
        int largestElement = largestElement(arr, 0, arr.length-1);
        if(arr[largestElement]==target)
        {
            return largestElement;
        }
        else if(target>=arr[0])
        {
            return binarSearch(arr, target, 0, largestElement);
        }
        else
        {
            return binarSearch(arr, target,largestElement, arr.length-1);
        }
    }
    public static int binarSearch(int[] arr ,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                end  =  mid -1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int largestElement(int[] arr,int start,int end)
    {
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[end]==arr[mid])
            {
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1])
                {
                    return end-1;
                }
                end--;
            }
            if(arr[start]<arr[mid] || arr[start]==arr[mid]&&arr[mid]>arr[end])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1 ;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {5,5,6,7,8,9,10,1,2,3,5};
        System.out.println(search(arr,3));
        System.out.println(search(arr,15));
    }
}