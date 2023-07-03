class recursion_a_to_n
{
    public static void main(int a,int n)
    {
        if(a==n+1)
            return;
        System.out.println(a);
        main(a+1,n);
    }
}