class pattern5
{
    public static void  ain(int n)
    {
        String s="";
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");

            System.out.print(s);

            for(int j=i;j>=1;j--)
                System.out.print(j+" ");

            System.out.println();
            s=s+"    ";
        }

    }
}