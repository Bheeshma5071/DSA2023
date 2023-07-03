class recursion_tower_of_hanoi
{
    public static void main(int n)
    {
        toh(n,"S","H","D");
    }

    public static void toh(int n,String src,String hel,String dest)
    {
        if(n==1)
        {
            System.out.println("Transfered disk "+n+" from "+src+" to "+dest);
            return;
        }
        toh(n-1,src,dest,hel);
        System.out.println("Transfered disk "+n+" from "+src+" to "+dest);
        toh(n-1,hel,src,dest);
    }
}