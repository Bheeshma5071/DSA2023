class digitadd_stringconcat
{
    public static void main(String a,String b)
    {
        String s=a+b;
        String s1="";
        int add=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
                s1+=ch;
            else if(Character.isDigit(ch))
                add+=Integer.valueOf(ch+"");
        }
        System.out.println(s1+add);
    }
}