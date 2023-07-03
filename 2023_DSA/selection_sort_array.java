import java.util.*;
class selection_sort_array
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 10 no.s");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
            a[i]=ob.nextInt();

        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(int i:a)
            System.out.println(i);
    }
}