class niven
{
    public static void main(int n)
    {
        int t=n,add=0;
        for(;t>0;t/=10)
            add+=t%10;

        System.out.println(n%add==0?"Niven no.":"not");
    }
}