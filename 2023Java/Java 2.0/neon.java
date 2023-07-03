class neon
{
    public static void main(int n)
    {
        int t=n*n,add=0;
        for(;t>0;t/=10)
            add+=t%10;

        System.out.println(add==n?"Neon no.":"not");
    }
}