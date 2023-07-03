class recursion_prime_testing
{
    public static void main(int n)
    {
        fact(n,1,0);
    }

    public static void fact(int n,int i,int c)
    {
        if(i==n)
        {
            System.out.println(c==1?"Prime":"Not");
            return;
        }
        if(n%i==0)
            c+=1;
        fact(n,i+1,c);
    }
}