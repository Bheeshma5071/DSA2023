import java.util.*;
class deletion
{
    public static void main(int n)
    {
        int a[]=new int[n];
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter "+n+" no.s :-");
        for(int i=0;i<n;i++)
            a[i]=ob.nextInt();

        System.out.println("Enter which positions value you want to delete ");
        int p=ob.nextInt();

        for(int i=p-1;i<n-1;i++)
        {
            int x=a[i];
            a[i]=a[i+1];
            a[i+1]=x;
        }

        for(int i:a)
            System.out.println(i);
    }
}