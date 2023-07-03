class floyd
{
    public static void main(int n)
    {
        int p=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++,p++)
                System.out.print(p+"  ");

            System.out.println();
        }
    }
}