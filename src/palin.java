import java.util.Scanner;

public class palin
{
    public static void main(String[] args) {
        System.out.println(palin());
    }
    public static int palin()
    {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
       int no = sc.nextInt();
       int length = sc.nextInt();
       String[] s = new String[no];
       int index=0;
        for (int i = 0; i < no; i++)
        {
            s[i] = sc.next();
        }
        for (int i = 0; i < length/2; i++)
        {
                if(s[index].charAt(i)==s[index].charAt(length-1))
                {
                    ans = 1;
                }
                else
                {
                    return 0;
                }
                length--;
        }
        return ans;
    }
}
