package All;
import java.util.Arrays;
public class ReverseArray
{
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,7,8};
        int[][] arrD =
                {
                        {1,3,5,7,8},
                        {6,5,4,3,3},
                        {24,5,2,52,5}
                };
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.deepToString(reverseDoubly(arrD)));
    }
    public static int[][] reverseDoubly(int[][] arr)
    {
        for(int[] arrr : arr)
        {
            for(int i=0;i<(arr[i].length)/2;i++)
            {
                int temp = arrr[i];
                arrr[i] = arrr[(arr[i].length -1)- i];
                arrr[arr[i].length -1 - i] = arrr[i];
            }
        }
        return arr;
    }
    public static int[] reverse(int[] arr)
    {
        for(int i=0;i<(arr.length)/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length -1 - i] = temp;
        }
        return arr;
    }
}
