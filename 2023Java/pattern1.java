class pattern1
{
    public static void main(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=(i*2)-1;j++)
                System.out.print(j+" ");

            System.out.println();
        }
    }
}