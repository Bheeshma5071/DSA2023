import java.util.*;
class insertion
{
    public static void main(int n)
    {
        int a[]=new int[n];
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter "+n+" no.s :-");
        for(int i=0;i<n-1;i++)
            a[i]=ob.nextInt();

        System.out.print("Enter value to be inserted - ");
        int v=ob.nextInt();

        System.out.print("Enter position where value is to be inserted - ");
        int p=ob.nextInt();

        for(int i=n-1;i>p-1;i--)
            a[i]=a[i-1];

        a[p-1]=v;

        for(int i:a)
            System.out.println(i);
    }
}