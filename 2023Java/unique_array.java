import java.util.*;
class unique_array
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int[10];

        System.out.println("Enter 10 no. s");
        for(int i=0;i<10;i++)
            a[i]=ob.nextInt();

        System.out.println("----------------------------------------------------------------------------");

        int b[]=new int[10];

        int k=0;

        for(int i=0;i<10;i++)
        {
            int t=0;
            for(int j=i+1;j<10;j++)
            {
                if(a[j]==a[i])
                    t=1;
            }
            if(t==0)

                b[k++]=a[i];
        }

        for(int i=0;i<k;i++)
            System.out.println(b[i]);
    }
}