class pattern6
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=i;j++)
                System.out.print(i+" ");

            for(int j=1;j<=n-i;j++)
                System.out.print((char)(i+64)+" ");

            System.out.println();
        }
    }
}