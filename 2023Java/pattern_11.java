class pattern_11
{
    public static void main(int n)
    {
        String s="";
        for(int i=n;i>=1;i--)
        {
            System.out.print(s);
            for(int j=(n-i)+1;j<=n;j++)
                System.out.print(j+" ");
            System.out.println();
            s+=" ";
        }
    }
}