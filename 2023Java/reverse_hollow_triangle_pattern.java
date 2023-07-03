class reverse_hollow_triangle_pattern
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
    }
}