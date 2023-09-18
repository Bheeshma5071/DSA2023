class AI_Closest_Divisible
{
    public static void main(int a,int b)
    {
        int a1=a,a2=2,b1=b,b2=b;
        for(;;)
        {
            if(a%b1==0)
            {
                System.out.println(a+" "+b1);
                break;
            }
            if(a%b2==0)
            {
                System.out.println(a+" "+b2);
                break;
            }
            if(a1%b==0)
            {
                System.out.println(a1+" "+b);
                break;
            }
            if(a2%b==0)
            {
                System.out.println(a2+" "+b);
                break;
            }
            a1++;
            b1++;
            a2--;
            b2--;
        }
    }
}