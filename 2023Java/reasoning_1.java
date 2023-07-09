class reasoning_1
{
    public static void main(int n,int a)
    {
        out(n*1-2,a,2);
    }

    public static void out(int n,int a,int i)
    {
        System.out.println(n);
        if(i>a)
            return;
        out(n*i-2,a,i+1);
    }
}