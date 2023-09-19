class DAY2_pangram_string
{
    public static void main(String s)
    {
        String s1="";
        s=s.trim().toUpperCase();
        for(int i=0;i<s.length();i++)
        {
            if(s1.indexOf(s.charAt(i))==-1 && Character.isLetter(s.charAt(i)))
                s1+=s.charAt(i);
        }
        System.out.println(s1.length()==26?"PANGRAM":"NO");
    }
}