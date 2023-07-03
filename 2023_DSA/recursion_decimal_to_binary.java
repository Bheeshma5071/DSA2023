class recursion_decimal_to_binary
{
    public static void main(int n)
    {
        System.out.println(dtb(n));
    }
    
    public static int dtb(int n)
    {
        return(n!=1?dtb(n/2)*10+(n%2):1);
    }
}