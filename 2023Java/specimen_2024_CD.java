import java.util.*;
class specimen_2024_CD
{
    public static void main()
    {
        Eshop a=new Eshop();
        a.accept();
        a.calculate();
        a.display();
    }
}
class Eshop
{
    String name;
    double price;
    void accept()
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter product name:  ");
        name=ob.next();
        System.out.print("Enter price:  ");
        price=ob.nextDouble();
    }

    void calculate()
    {
        double dis=0.0;
        if(price>=1000 && price<=25000)
            dis=(5.0/100.0)*price;
        else if(price<=57000)
            dis=(7.5/100.0)*price;
        else if(price<=100000)
            dis=(10.0/100.0)*price;
        else if(price>100000)
            dis=(15.0/100.0)*price;
        price-=dis;
    }
    
    void display()
    {
        System.out.println("Name :  "+name+"\n"+"Price:  "+price);
    }
}