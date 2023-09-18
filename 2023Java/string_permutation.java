class string_permutation
{
    public static void main(String s)
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            s1+=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if(i!=j)
                    s1+=s.charAt(j);
                System.out.println("INNER LOOP  "+s1);
            }
            System.out.println(s1);
            s1="";
        }
    }
}