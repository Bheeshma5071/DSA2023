class fibo_plus_tribo
{
    public static void main(int n)
    {
        int a[]=fibo(n);
        int b[]=tribo(n);
        for(int i=0;i<n;i++)
            System.out.println(a[i]+b[i]);
    }

    public static int[] fibo(int n)
    {
        int a[]=new int[n];
        int fn=0,sn=1,add=0;
        for(int i=0;i<n;i++)
        {
            a[i]=fn;
            add=fn+sn;
            fn=sn;
            sn=add;
        }
        return(a);
    }

    public static int[] tribo(int n)
    {
        int a[]=new int[n];
        int fn=0,sn=0,tn=1,add=0;
        for(int i=0;i<n;i++)
        {
            a[i]=fn;
            add=fn+sn+tn;
            fn=sn;
            sn=tn;
            tn=add;
        }
        return(a);
    }
}