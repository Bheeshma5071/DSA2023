class alphabetical_arrangement
{
    public static void main(String s)
    {
        String s2="";
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==(char)(i)||s.charAt(j)==(char)(i+32))
                    s2+=s.charAt(j);
            }
        }
        System.out.println(s2);
    }
}