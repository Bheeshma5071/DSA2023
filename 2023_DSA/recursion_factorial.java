class recursion_factorial
{
    public static void main(int n)
    {
        fact(1,n);
    }

    public static void fact(int pro,int n)
    {
        if(n==1)
        {
            System.out.println(pro);
            return;
        }
        pro*=n;
        fact(pro,n-1);
    }
}