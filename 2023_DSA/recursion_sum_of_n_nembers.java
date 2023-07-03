class recursion_sum_of_n_nembers
{
    public static void main(int n)
    {
        sum(1,n,0);
    }

    public static void sum(int i,int n,int add)
    {
        if(i==n)
        {
            add+=n;
            System.out.println(add);
            return;
        }
        add+=i;
        sum(i+1,n,add);
    }
}