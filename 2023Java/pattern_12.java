class pattern_12
{
    public static void main(char ch)
    {
        int n=(ch)-64;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print((char)(i+64));
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print((char)(i+64));
            System.out.println();
        }
    }
}