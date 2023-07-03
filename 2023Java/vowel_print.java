class vowel_print
{
    public static void main(String s)
    {
        String v="AEIOUaeiou";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(v.indexOf(ch)>=0)
                System.out.println(ch);
        }
    }
}