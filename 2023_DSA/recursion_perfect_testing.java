class recursion_perfect_testing
{
    public static void main(int n)
    {
        fact(n,1,0);
    }

    public static void fact(int n,int i,int c)
    {
        if(i==n)
        {
            System.out.println(c==n?"Perfect":"Not");
            return;
        }
        if(n%i==0)
            c+=i;
        fact(n,i+1,c);
    }
}