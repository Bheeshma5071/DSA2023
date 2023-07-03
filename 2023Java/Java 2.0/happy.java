class happy
{
    public static void main(int n)
    {
        while(n>9)
        {
            int sum=0;
            for(;n>0;n/=10)
                sum+=(n%10)*(n%10);
            n=sum;
        }

        System.out.println(n==1?"Happy":"Sad");
    }
}