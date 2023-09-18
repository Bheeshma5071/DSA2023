class duck_number_2
{
    public static void main(int n)
    {
        String s=n+"";
        System.out.println(s.length()!=s.replace("0","").length() && n%10!=0?"Quack":"Not");
    }
}