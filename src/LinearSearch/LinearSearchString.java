package LinearSearch;
//Finding the char in string by the linear search
public class LinearSearchString
{
    public static int linearSearchinchar(String arr ,char target)
    {
        if(arr.length()==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length();i++)
        {
            if(arr.charAt(i)==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        String arr = "sammit khade";
        char target = 'e';
        System.out.println(linearSearchinchar(arr,target));
    }
}

