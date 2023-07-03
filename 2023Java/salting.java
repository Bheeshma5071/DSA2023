class salting
{
    public static void main(int n,String k)
    {
        String s="";
        int t=(n+"").length();
        for(int i=1;i<=t*2-1;i++)
        {
            if(i%2==1)
            {
                s=n%10+s;
                n/=10;
            }
            else
                s=k+s;
        }
        System.out.println(s);
    }
}