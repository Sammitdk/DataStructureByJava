package LinearSearch;
import java.util.Arrays;
public class RowColumnMatrix
{
    public static void main(String[] args)
    {
        int arr[][] =
                {
                        {10,20,30},
                        {40,50,60},
                        {70,80,90}
                };
        int target = 50;
        System.out.println(Arrays.toString(searchTwoDarray(arr,target)));
    }
    public static int[] searchTwoDarray(int[][] arr,int target)
    {
        int row = 0;
        int column = arr.length - 1;
        while (row < arr.length && column > 0)
        {
            if(arr[row][column]==target)
            {
                return new int[] {row,column};
            }
            else if(arr[row][column] < target)
            {
                row++;
            }
            else
            {
                column--;
            }
        }
        return new int[] {-1,-1};
    }
}

