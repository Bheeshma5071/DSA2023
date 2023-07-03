class string_pattern
{
    public static void main(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int k=0;k<=i;k++)
                System.out.print(s.charAt(k)+" ");
            System.out.println();
        }
    }
}