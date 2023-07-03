class recursion_palindrome
{
    public static void main(int n)
    {
        pal(n,0,n);
    }

    public static void pal(int n,int add,int x)
    {
        if(n>0)
        {
            add=add*10+(n%10);
            pal(n/10,add,x);
        }
        else
        {
            System.out.println(add==x?"Palindrome":"Not");
            return;
        }
    }
}