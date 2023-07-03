import java.util.*;
class strign_sort
{
    public static void main(int n)
    {
        String a[]=new String[n];
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter "+n+" no.s :-");
        for(int i=0;i<n;i++)
            a[i]=ob.next();

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    String t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }

        System.out.println("...........................................");
        for(String i:a)
            System.out.println(i);
    }
}