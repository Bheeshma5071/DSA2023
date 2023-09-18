class duck_number
{
    public static void main(int n)
    {
        String s=n+"";
        if(s.indexOf('0')!=-1 && n%10!=0)
            System.out.println("Duck");
        else
            System.out.println("Not");
    }
}