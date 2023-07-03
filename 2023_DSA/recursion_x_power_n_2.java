class recursion_x_power_n_2
{
    public static void main(int x,int n)
    {
        System.out.println(power(x,n));
    }

    public static int power(int x,int n)
    {
        return(n==0?(x==0?0:1):(x*power(x,n-1)));
    }
}