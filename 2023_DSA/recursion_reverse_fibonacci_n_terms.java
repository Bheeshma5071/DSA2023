class recursion_reverse_fibonacci_n_terms
{
    public static void main(int n)
    {
        fibo(0,1,n);
    }

    public static void fibo(int a,int b,int n)
    {
        if(n==0)
            return;
        fibo(a+b,a,n-1);
        System.out.println(a);
    }
}