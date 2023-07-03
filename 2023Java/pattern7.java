class pattern7
{
    public static void main(String s)
    {
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(s.charAt(j-1)+" ");

            System.out.println();
        }
    }
}