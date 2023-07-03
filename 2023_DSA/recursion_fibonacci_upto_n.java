class recursion_fibonacci_upto_n
{
    public static void main(int n)
    {
        fibo(0,1,n);
    }

    public static void fibo(int a,int b,int n)
    {
        
        if(a>n)
            return;
        System.out.println(a);
        fibo(a+b,a,n);
    }
}