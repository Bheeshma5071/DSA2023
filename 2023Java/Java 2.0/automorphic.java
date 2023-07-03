class automorphic
{
    public static void main(int n)
    {
        int t=n*n;
        int x=(n+"").length();
        
        System.out.println(t%(Math.pow(10,x))==n?"Auto":"Toto");
    }
}