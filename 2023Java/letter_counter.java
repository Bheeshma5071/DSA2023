class letter_counter
{
    public static void main(String s)
    {
        for(;s.length()>0;)
        {
            int x=s.length();
            char ch=s.charAt(0);
            s=s.replace(ch+"","");
            System.out.println(ch+"----- "+(x-s.length()));
        }
    }
}