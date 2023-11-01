public class Solutions
{
    public static void main(String[] arg)
    {
        int len = 10;

        for(int i = 0; i < len; i++)
        {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}