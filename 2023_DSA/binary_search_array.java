import java.util.*;
class binary_search_array
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 10 no.s");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
            a[i]=ob.nextInt();

        System.out.println("Enter value to be searched");
        int v=ob.nextInt();

        int f=-1;
        int fp=0,lp=9;
        int mp=(fp+lp)/2;
        for(;fp<=lp;mp=(fp+lp)/2)
        {
            if(a[mp]==v)
            {
                f=mp;
                break;
            }
            if(a[mp]>v)
                lp=mp-1;
            if(a[mp]<v)
                fp=mp+1;
        }
        System.out.println(fp!=-1?"The value is at index --- "+f:"Value does not exist");
    }
}