class recursion_factors_of_n
{
    public static void main(int n)
    {
        fact(n,1);
    }

    public static void fact(int n,int i)
    {
        if(i==n)
            return;
        System.out.print(n%i==0?i+"\n":"");
        fact(n,i+1);
    }
}