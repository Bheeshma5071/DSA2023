import java.util.*;
class specimen_2024_Special_Array
{
    public static void main()
    {
        int a[][]=new int[3][3];
        Scanner ob=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                a[i][j]=ob.nextInt();
            System.out.println("changing row...");
        }

        int even=0,odd=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int t=a[i][j];
                even+=(t%2==0)?t:0;
                even+=(t%2==1)?t:0;
            }
        }
        System.out.println(even==odd?"Special Array":"Not");
    }
}