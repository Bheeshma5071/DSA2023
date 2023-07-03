class string_pattern4
{
    public static void main(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.substring(i));
            System.out.println(s.substring(0,i));
        }
    }
}