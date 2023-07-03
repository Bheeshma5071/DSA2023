import java.util.*;
class linear_search_array
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 10 no.s");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
            a[i]=ob.nextInt();

        int f=-1;

        System.out.println("Enter value to be searched");
        int v=ob.nextInt();

        for(int i=0;i<10;i++)
        {
            if(a[i]==v)
            {
                f=i;
                break;
            }
        }

        System.out.println(f>=0?"value is at index --- "+f:"Value does not exist");
    }
}