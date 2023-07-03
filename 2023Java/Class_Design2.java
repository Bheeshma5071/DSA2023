import java.util.*;
class Class_Design2
{
    public static void main()
    {
        Array_Maxmin sc=new Array_Maxmin();
        sc.input();
    }
}
class Array_Maxmin
{
    private int i,max,min,m[];
    void input()
    {
        Scanner ob=new Scanner(System.in);
        m=new int[10];
        System.out.println("Enter 10 no.");
        for(i=0;i<10;i++)
            m[i]=ob.nextInt();
        min=m[0];
        max=m[0];
        display();
    }

    private void max()
    {
        for(i=0;i<10;i++)
        {
            if(m[i]>max)
                max=m[i];
        }
        System.out.println("The largest no. in array is -  "+max);
    }

    private void min()
    {
        for(i=0;i<10;i++)
        {
            if(m[i]<min)
                min=m[i];
        }
        System.out.println("The smallest no. in array is -  "+min);
    }

    void display()
    {
        max();
        min();
    }
}