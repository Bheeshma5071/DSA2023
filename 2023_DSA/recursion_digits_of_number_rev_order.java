class recursion_digits_of_number_rev_order
{
    public static void main(int n)
    {
        print(n,0);
    }

    public static void print(int n,int add)
    {
        if(n>0)
        {
            add=add*10+(n%10);
            print(n/10,add);
        }
        else
        {
            System.out.println(add);
            return;
        }
    }
}