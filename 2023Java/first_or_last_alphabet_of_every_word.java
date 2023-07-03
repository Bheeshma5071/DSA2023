class first_or_last_alphabet_of_every_word
{

    public static void main(String s,int ch)
    {
        s=s.trim()+" ";
        if(ch==1)
        {
            for(;s.length()>1;)
            {
                int x=s.indexOf(' ');
                String s1=(s.substring(0,x));
                System.out.println(s1.charAt(0));
                s=s.substring(x+1);
            }
        }
        else if(ch==2)
        {
            for(;s.length()>1;)
            {
                int x=s.indexOf(' ');
                String s1=(s.substring(0,x));
                System.out.println(s1.charAt(s1.length()-1));
                s=s.substring(x+1);
            }
        }
        else
            System.out.println("Wrong choice");
    }
}