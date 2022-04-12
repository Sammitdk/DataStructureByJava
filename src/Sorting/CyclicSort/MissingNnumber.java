package Sorting.CyclicSort;
public class MissingNnumber
{
    public static void main(String[] args)
    {
        int[] arr = {4,2,1,0};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i];
            if(arr[i]<arr.length && arr[correct]!=arr[i])
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
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                return i;
            }
        }
        return arr.length;
    }
}