class string_combination
{
    public static void main(String s)
    {
        try
        {
            int n=s.length();
            for (int i=0;i<n;i++) 
            {
                for (int j=i+1;j<=n;j++)
                    System.out.println(s.substring(i,j));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}