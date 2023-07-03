import java.util.*;
class two_way_LL
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        A home=new A();
        A node=home;
        System.out.println("Enter no: ");
        node.x=ob.nextInt();
        node.n=null;
        node.n1=null;
        while(true)
        {
            System.out.println("Enter no. : ");
            int v=ob.nextInt();
            if(v==0)
                break;
            A node1=new A();
            node1.x=v;
            node.n=node1;
            node1.n=null;
            node=node1;
            /**
               
             W R O N G
               
            */
            System.out.println("Enter no. : ");
            int v1=ob.nextInt();
            if(v1==0)
                break;
            A node2=new A();
            node2.x=v1;
            node.n1=node2;
            node2.n=null;
            node=node2;
        }
        node=home;
        while(node!=null)
        {
            System.out.println(node.x);
            node=node.n;
        }
    }
}
class A
{
    A n;
    A n1;
    int x;
}