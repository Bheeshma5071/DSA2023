class reverse_every_word_and_print
{
    public static void main(String s)
    {
        s=s.trim()+" ";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.println(s1);
                s1="";
            }
            else
                s1=s.charAt(i)+s1;
        } 

    }
}