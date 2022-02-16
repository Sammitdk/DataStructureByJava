package LinearSearch;
public class LinearSearch
{
    public static int linearSearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i= 0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,3,40,20,50,17,69};
        int target = 20;
        System.out.println("The index is "+linearSearch(arr,target));
    }
}
