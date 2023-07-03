class test
{
    public static void main(int n)
    {
        int add=0,b=0;
        while(n>0)
        {
            b=Math.abs(((n/10)%10)-n%10);
            add=add*10+b;
            n=n/10;
        }
        add=add/10;
        System.out.println(add);
    }
}