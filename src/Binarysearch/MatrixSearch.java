package Binarysearch;
import java.util.Arrays;
public class MatrixSearch
{
    public static int[] matrixSearch(int[][] arr,int target)
    {
        int row = 0;
        int column = arr[0].length-1;
        while(row<arr.length && column>=0)
            {
                if(arr[row][column]==target)
                {
                    return new int[]{row, column};
                }
                else if(arr[row][column]<target)
                {
                    row++;
                }
                else
                {
                    column--;
                }
            }
        return new int[]{-1, -1};
    }
    public static void main(String[] args)
    {
        int[][] arr = {
                        {10,20,30,40},
                        {11,25,35,45},
                        {28,29,37,49},
                        {33,34,38,50},
                      };
        int target = 40;
        System.out.println(Arrays.toString(matrixSearch(arr,target)));
    }
}
