package Sorting.CyclicSort;
public class FirstMissing
{
    public static void main(String[] args)
    {
        int[] arr = {-1,20,5,3,2,1};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] arr)
    {
        int i =0;
        while(i<arr.length)
        {
            int correct = arr[i] - 1 ;
            if(  arr[i] > 0 &&  arr[i] <= arr.length && arr[correct] != arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[correct] ;
                arr[correct] = temp ;
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] != i+1)
            {
                return i+1;
            }
        }
        return arr.length+1;
    }
}
