package Sorting.InsertionSort;
import java.util.Arrays;
public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] arr = {20,54,88,-32,66,12};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr)
    {
        int length = arr.length;
        for (int i = 0; i < length-1 ; i++)
        {
            for (int j = i+1; j > 0 ; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = 0;
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else
                {
                    break;
                }
            }

        }
        return arr;
    }
}
