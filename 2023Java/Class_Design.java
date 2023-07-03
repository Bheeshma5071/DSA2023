class Class_Design
{
    public static void main()
    {
        int a[]={2,5,1,3,4};
        Bhut ob=new Bhut(a);
        ob.sort(ob);
        ob.dis(ob);
    }
}
class Bhut
{
    int n[];
    Bhut(int x[])
    {
        n=new int[x.length];
        for(int i=0;i<n.length;i++)
            n[i]=x[i];
    }

    static void sort(Bhut ob)
    {
        for(int i=0;i<ob.n.length;i++)
        {
            for(int j=i+1;j<ob.n.length;j++)
            {
                if(ob.n[i]>ob.n[j])
                {
                    int t=ob.n[i];
                    ob.n[i]=ob.n[j];
                    ob.n[j]=t;
                }
            }
        }
    }

    void dis(Bhut ob)
    {
        for(int i:n)
            System.out.println(i);
    }
}