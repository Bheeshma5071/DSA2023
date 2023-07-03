import java.util.*;
class method_overload
{
    public static void main()
    {
        A ob=new A();
        ob.num_cal("Jahir","Jahir");
        ob.num_cal(5,'s');
        ob.num_cal(2,5,'d');
    }
}
class A
{
    void num_cal(int num,char ch)
    {
        System.out.println(ch=='s' || ch=='S'?num*num:num*num*num);        
    }
    void num_cal(int a,int b,char ch)
    {
        System.out.println(ch=='p' || ch=='P'?a*b:a+b);
    }
    void num_cal(String str1,String str2)
    {
        System.out.println(str1.equals(str2)?"EQUAL":"NOT");
    }
}