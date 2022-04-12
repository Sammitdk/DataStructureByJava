package Sorting.CyclicSort;
import java.util.*;
class DuplicatesInArray
{
    public static void main(String[] args)
    {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i<nums.length)
        {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct])
            {
                int temp = 0;
                temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i] != i+1)
            {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}