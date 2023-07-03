import java.util.*;
class bubble_sort_array
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
            for(int j=0;j<9;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(int i:a)
            System.out.println(i);
    }
}