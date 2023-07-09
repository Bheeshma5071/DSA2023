class pattern_9
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j%2);
            for(int j=1;j<=n-i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}