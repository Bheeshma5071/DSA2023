class pattern2
{
    public static void main(int n)
    {
        for(int i=n;i>=1;i--)
        {

            for(int k=i;k<n;k++)
                System.out.print(" ");

            for(int j=1;j<=i;j++)
                System.out.print(j+" ");

            System.out.println();
        }
    }
}