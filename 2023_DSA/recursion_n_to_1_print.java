class recursion_n_to_1_print
{
    public static void main(int n)
    {
        rev(n,1);
    }
    public static int rev(int n,int a)
    {
        System.out.println(n);
        return(n>a?rev(n-1,a):a);
    }
}