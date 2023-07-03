import java.util.*;
class array_2d
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
        int sum=0,max=a[0][0],min=a[0][0];

        for(int i=0;i<3;i++)
        {
            int add=0;
            for(int j=0;j<3;j++)
            {
                sum+=a[i][j];   //adding all numbers in 2d-array
                max=Math.max(max,a[i][j]);  //checking maximum
                min=Math.min(min,a[i][j]);  //checking minimum
                add+=a[i][j];   //adding numbers in each row
            }
            System.out.println("Sum of row "+(i+1)+" ---  "+add);
        }
        
        System.out.println("Sum of all numbers ---  "+sum);
        System.out.println("Maximum of all numbers ---  "+max);
        System.out.println("Minimum of all numbers ---  "+min);
        System.out.println("Average of all numbers ---  "+(sum/9.0));
    }
}