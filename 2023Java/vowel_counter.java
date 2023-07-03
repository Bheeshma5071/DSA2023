class vowel_counter
{
    public static void main(String s)
    {
        s=s.trim();
        s=s.toUpperCase();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
                c++;
        }
        System.out.println(c);
    }
}