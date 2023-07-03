class recursion_binary_to_decimal
{
    public static void main(int n)
    {
        System.out.println(btd(n,0));
    }
    
    public static int btd(int n,int x)
    {
        return(n==0?0:(int)(Math.pow(2,x))*(n%10)+(btd(n/10,x+1)));
    }
}