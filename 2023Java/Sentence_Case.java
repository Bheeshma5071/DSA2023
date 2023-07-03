class Sentence_Case
{
    public static void main(String s)
    {
        s=s.trim()+" ";
        String s1="",s2="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                s2=(s1.length()>=1?s2+Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ":s2);
                s1="";
            }
            else
                s1+=s.charAt(i);
        } 
        System.out.println(s2);
    }
}