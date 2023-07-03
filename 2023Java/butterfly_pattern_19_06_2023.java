class butterfly_pattern_19_06_2023
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int j=1;j<=(n-i)*2;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int j=1;j<=(n-i)*2;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}