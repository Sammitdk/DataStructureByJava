package All;

public class Fibo
{
    public static void main(String[] args)
    {
        System.out.println(fibo(8));
    }
    public static int fibo(int no)
    {
        if(no < 2)
        {
            return no;
        }
        return fibo(no-1)+fibo(no-2);
    }
}
