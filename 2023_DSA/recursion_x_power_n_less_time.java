class recursion_x_power_n_less_time
{
    public static void main(int x,int n)
    {
        System.out.println(power(x,n));
    }

    public static int power(int x,int n)
    {
        if(n==0)
            return 1;
        if(x==0)
            return 0;
        if(n%2==0)
            return power(x,n/2)*(power(x,n/2));
        else
            return power(x,n/2)*power(x,n/2)*x;
    }
}