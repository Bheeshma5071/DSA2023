class hollow_hourglass_pattern
{
    public static void main(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(j==1 || j==i || i==n?"* ":"  ");
            System.out.println();
        }
        
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(j==1 || j==i || i==n?"* ":"  ");
            System.out.println();
        }
    }
}