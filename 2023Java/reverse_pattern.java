class reverse_pattern
{
    public static void main(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}