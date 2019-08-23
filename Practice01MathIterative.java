public class Practice01MathIterative implements Practice01Math {

    public int fact(int n) throws Exception
    {
        int total = 1;

        if(n < 0)
        {
            throw new Exception();
        }
        else if(n == 0)
        {
            return 1;
        }
        for(int i = 1; i <= n; i++)
        {
            total *= i;
        }

        return total;
    }

    public int fib(int n) throws Exception
    {
        int head = 1;
        int last1 = 1;

        if(n < 0)
        {
            throw new Exception();
        }
        else if(n == 0 || n == 1)
        {
            return n;
        }
        else
        {
            for(int i = 2; i < n; i++)
            {
                head += last1;
                last1 = head - last1;
            }
        }
        return head;
    }
}
