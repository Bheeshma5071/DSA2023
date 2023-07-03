class pattern4
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<i;j++)
                System.out.print(i+" ");

            for(int j=i;j<=n;j++)
                System.out.print(j+" ");


            System.out.println();
        }
    }
}