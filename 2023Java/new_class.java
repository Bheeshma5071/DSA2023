class new_class
{
    public static void main(int n)
    {
        int add=n/100+n%10+n/10%10;
        System.out.println(add*add*add==n?"yes":"no");
    }
}