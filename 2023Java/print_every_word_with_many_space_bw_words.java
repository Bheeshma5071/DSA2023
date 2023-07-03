class print_every_word_with_many_space_bw_words
{
    public static void main(String s)
    {
        s=s.trim()+" ";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.print(s1.length()>=1?s1+"\n":"");
                s1="";
            }
            else
                s1+=s.charAt(i);
        } 
    }
}