// All about (^) operator
//  The name of ^ is (X-or)
//  0   0  = 0  If no ^ with no then it will give 0
//  0   1  = 1  If no ^ with 1  then it will give complement of that no
//  1   0  = 1  If no ^ with 0  then it will give the number itself
//  1   1  = 0

package All;

import java.util.ArrayList;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,2,1,4,4};
        int[] arr1 = {2,4,1,2,4,1};
        System.out.println(UniqueInArray(arr));
        System.out.println(removeDuplicate(arr1));
    }
    public static int UniqueInArray(int[] arr)
    {
        int ans = 0;
        for(int a : arr)
        {
            ans =  ans ^ a ;
        }
        return ans;
    }
    public static ArrayList<Integer> removeDuplicate(int[] arr)
    {
        int temp = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i < arr.length;i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if((arr[i] ^ arr[j]) == 0)
                {
                    list.add(arr[j]);
                }
            }
        }
        return list;

    }
}