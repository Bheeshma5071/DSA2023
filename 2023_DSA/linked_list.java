import java.util.*;
class linked_list
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        A home=new A();
        A node=home;
        System.out.print("Enter no.  ");
        node.x=ob.nextInt();
        node.n=null;
        while(true)
        {
            System.out.print("Enter no.  ");
            int v=ob.nextInt();
            if(v==0)
                break;
            A node1=new A();
            node1.x=v;
            node.n=node1;
            node1.n=null;
            node=node1;
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
    int x;
    A n;
}