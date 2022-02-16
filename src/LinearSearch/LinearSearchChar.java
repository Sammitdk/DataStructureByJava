package LinearSearch;
public class LinearSearchChar
{
    public static int Test(char[] arr , int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
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
        char[] arr1 = {'a','t','b','z'};
        char target = 'b';
        System.out.println("The char is at "+Test(arr1,target));
    }
}
