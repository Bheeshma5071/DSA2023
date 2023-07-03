import java.util.*;
class insertion_sort2_array
{
    public static void main()
    {
        int a[]=new int[5];
        Scanner ob=new Scanner(System.in);
        for(int i=0;i<5;i++)
            a[i]=ob.nextInt();
        for(int i=0;i<4;i++)
        {
            if(a[i+1]<a[i])
            {
                int t=a[i+1],c=-1;
                for(int j=i;j>=0;j--)
                {
                    if(t<a[j])
                        c=j;
                }
                for(int k=i+1;k>c;k--)
                    a[k]=a[k-1];
                a[c]=t;
            }
        }
        System.out.println("-----------------------------------------------------------");
        for(int i:a)
            System.out.println(i);
    }
}