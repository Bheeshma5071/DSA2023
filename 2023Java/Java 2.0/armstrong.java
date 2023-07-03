class armstrong
{
    public static void main(int n)
    {
        int t=n,sum=0;

        for(;t>0;t/=10)
        {
            int p=(t%10)*(t%10)*(t%10);
            sum+=p;
        }

        System.out.println(sum==n?"Bahubali":"vallaldev");
    }
}