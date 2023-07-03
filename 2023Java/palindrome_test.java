class palindrome_test
{
    public static void main(int n)
    {
        System.out.println(rev(n)==n?"PALINDROME":"NOT");
    }

    public static int rev(int n)
    {
        int add=0;
        for(;n>0;n/=10)
            add=add*10+n%10;
        return(add);
    }
}