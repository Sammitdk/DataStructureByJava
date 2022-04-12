package Sorting.CyclicSort;
public class FindDuplicateNumber
{
    public static void main(String[] args)
    {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate1(arr));
    }
    public static int findDuplicate(int[] arr)
    {
        int i = 0;
        int ans = 0;
        while(i<arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                ans = arr[i];
            }
        }
        return ans;
    }
    public static int findDuplicate1(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            if(arr[i] != i+1)
            {
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct])
                {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }
                else
                {
                    return arr[i];
                }
            }
            else
            {
                i++;
            }
        }
        return -1;
    }
}
