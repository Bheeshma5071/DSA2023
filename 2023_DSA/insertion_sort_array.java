import java.util.*;
class insertion_sort_array
{
    public static void main()
    {
        int a[]=new int[10];
        Scanner ob=new Scanner(System.in);
        for(int i=0;i<10;i++)
            a[i]=ob.nextInt();
        for(int i=1;i<10;i++)
        {
            if(a[i]<a[i-1])
            {
                int t=a[i],c=-1;
                for(int j=i-1;j>=0;j--)
                {
                    if(t<a[j])
                        c=j;
                }
                for(int k=i;k>c;k--)
                    a[k]=a[k-1];
                a[c]=t;
            }
        }
        System.out.println(".............................................................................................");
        for(int i:a)
            System.out.println(i);
    }
}