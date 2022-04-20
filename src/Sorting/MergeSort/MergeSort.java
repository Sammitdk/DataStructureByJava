// Time Complexity
// n is the total number of comparisons
// log N is the total levels
// It is the time complexity of Merge Sort O(n * log N)

// Space Complexity
// N is the max height of tree / extra space
// It is the space complexity O(N)

package Sorting.MergeSort;
import java.util.Arrays;
public class MergeSort
{
    public static void main(String[] args)
    {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int start,int end)
    {
        if(end - start == 1)
        {
            return;
        }
        int mid = (start + end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end)
    {
        int[] ans = new int[end-start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end)
        {
            if(arr[i] < arr[j])
            {
                ans[k] = arr[i];
                i++;
            }
            else
            {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid)
        {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j < end)
        {
            ans[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < ans.length; l++)
        {
            arr[start+l] = ans[l];
        }
    }
}
