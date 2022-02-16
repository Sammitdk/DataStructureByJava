package LinearSearch;
public class LinearSearchStartEnd
{
    public static int linearSearch(int[] arr,int target,int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=start;index<=end;index++)
        {
            if(arr[index]==target)
            {
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,3,40,20,50,17,69};
        int target = 50;
        System.out.println("The index is "+linearSearch(arr,target,2,4));
    }
}