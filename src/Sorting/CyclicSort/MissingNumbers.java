package Sorting.CyclicSort;
import java.util.Arrays;
import java.util.ArrayList;
public class MissingNumbers
{
    public static void main(String[] args)
    {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumber(arr));
    }
    public static ArrayList<Integer> missingNumber(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                int temp = 0;
                temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else
            {
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                ans.add(i+1);
            }
        }
        return ans;
    }
}