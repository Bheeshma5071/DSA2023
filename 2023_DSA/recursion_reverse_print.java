class recursion_reverse_print
{
    public static void main(int n)
    {
        System.out.println(n);
        if(n>1)
            main(n-1);
        else
            return;
    }
}