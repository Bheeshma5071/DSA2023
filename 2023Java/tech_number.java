class tech_number
{
    public static void main(int n)
    {
        int x=(int)(Math.pow(10,(n+"").length()/2.0));
        int a=n/x;
        int b=n%x;
        System.out.println((a+b)*(a+b)==n?"Tech Number":"Not");
    }
}