import java.util.*;
class DAY3_array_element_sum
{
    public static void main()
    {
        int a[]=new int[10];
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter array no. input");
        for(int i=0;i<10;i++)
            a[i]=ob.nextInt();
        System.out.println("Enter specified value");
        int v=ob.nextInt();
        System.out.println("-------------------------------------------------------------------------");
        for(int i=0;i<9;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]+a[j]==v)
                {
                    System.out.println("The required pair is :-  "+a[i]+" and "+a[j]);
                }
            }
        }
    }
}