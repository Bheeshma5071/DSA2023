class recursion_factorial2
{
    public static void main(int n)
    {
        System.out.println(fact(n));
    }

    public static int fact(int n)
    {
        return(n>0?n*(fact(n-1)):1);
    }
}