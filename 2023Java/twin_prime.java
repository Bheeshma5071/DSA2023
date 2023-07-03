class twin_prime
{
    public static void main(int a,int b)
    {
        System.out.println(prime(a)==0 && (prime(b))==0 && Math.abs(a-b)==2?"TP":"NOT");
    }

    static int prime(int n)
    {
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                c++;
        }
        return(c==0?0:1);
    }
}