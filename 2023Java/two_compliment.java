class two_compliment
{
    public static void main(int n)
    {
        int f=0,add=0,x=1;
        
        for(;n>0;n/=10)
        {
            if(f==0)
                add+=(n%10)*x;
            else if(f==1)
                add+=(1-n%10)*x;
            if(n%10==1)
                f=1;
            x=x*10;
        }
        System.out.println(add);
    }
}