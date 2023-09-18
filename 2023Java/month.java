class month
{
    public static void main(String s,int n)
    {
        s=s.trim().toUpperCase();
        for(;s.length()>=n;)
        {
            System.out.println(s.substring(0,n));
            s=s.substring(n);
        }
    }
}