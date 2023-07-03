class wordcounter
{
    public static void main(String s)
    {
        s=s.trim()+" ";
        String s1=s.replace(" ","");
        System.out.println(s.length()-s1.length());
    }
}