class name_shortener
{
    public static void main(String s)
    {
        s=s.trim();
        int p=s.lastIndexOf(' ');
        String s1="";
        for(int i=0;i<p;i++)
        {
            int x=s.indexOf(' ');
            if(x>=0)
            {
                String s2=(s.substring(0,x));
                s1=s1+s2.charAt(0)+". ";
            }
            s=s.substring(x+1);
        }
        System.out.println(s1+s);
    }
}