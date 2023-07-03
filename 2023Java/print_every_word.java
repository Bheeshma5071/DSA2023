class print_every_word
{
    public static void main(String s)
    {
        s=s.trim()+" ";
        for(;s.length()>1;)
        {
            int x=s.indexOf(' ');
            System.out.println(s.substring(0,x));
            s=s.substring(x+1);
        }
    }
}