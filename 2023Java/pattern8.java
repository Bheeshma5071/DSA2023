class pattern8
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}