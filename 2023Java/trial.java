class trial
{
    public static void main(String s)
    {
        s=s.trim();
        s=" "+s;
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
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