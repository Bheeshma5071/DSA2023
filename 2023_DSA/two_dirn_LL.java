import java.util.*;
class two_dirn_LL
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        A home=new A();
        A node=home;
        node.n=null;
        node.p=null;
        while(true)
        {
            System.out.println("enter no.");
            int v=ob.nextInt();
            if(v==0)
                break;
            A node1=new A();
            node1.x=v;
            node1.p=node;
            node.n=node1;
            node1.n=null;
            node=node1;
        }
        node=home;
        System.out.println(".............................................................................");
        while(true)
        {
            System.out.println(node.x);
            if(node.n==null)
                break;
            node=node.n;
        }
        System.out.println(".............................................................................");
        while(node!=null)
        {
            System.out.println(node.x);
            node=node.p;
        }
    }
}

class A
{
    A n;
    A p;
    int x;
}