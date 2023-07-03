class recursion_x_power_n
{
    //Here height of stack should be n and we have to print x^n
    public static void main(int x,int n)
    {
        System.out.println(power(x,n,1));
    }

    public static int power(int x,int n,int i)
    {
        return(i<=n?x*(power(x,n,i+1)):1);
    }
}