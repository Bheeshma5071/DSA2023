class pattern3
{
    public static void main(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int k=n-i;k<n;k++)
                System.out.print("  ");

            for(int j=n-i;j>=1;j--)
                System.out.print(j+" ");

            System.out.println();
        }
    }
}