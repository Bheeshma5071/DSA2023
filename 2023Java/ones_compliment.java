class ones_compliment
{
    public static void main(int n)
    {
        String s=(n+"").replace("1"," ");
        s=s.replace("0","1");
        s=s.replace(" ","0");
        System.out.println(Integer.parseInt(s));
    }
}