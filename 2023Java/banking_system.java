import java.util.*;
class banking_system
{
    public static void main()
    {
        String cus_name[]=new String[5];
        long cus_acc_no[]=new long[5];
        double cus_bal[]=new double[5];

        Scanner ob=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter details of customer no. "+(i+1));
            
            
            System.out.println("Enter customer name :-  ");
            cus_name[i]=ob.next();

            System.out.println("Enter customer account number :-  ");
            cus_acc_no[i]=ob.nextLong();

            System.out.println("Enter customer bank balance :-  ");
            cus_bal[i]=ob.nextDouble();

            System.out.println();
        }

        
        System.out.println("Enter customer name with whose account you want to proceed");
        String name=ob.next();
        
        System.out.println();
        

        System.out.println("1. Withdraw "+"\t"+"2. Deposit"+"\n"+"3. Balance Enquiry"+"\t"+"4. Exit");
        
        
        System.out.println("Enter 1,2,3 or 4 to continue");
        int ch=ob.nextInt();

        int v=-1;

        System.out.println();
        
        for(int i=0;i<5;i++)
        {
            if(cus_name[i].equalsIgnoreCase(name))
                v=i;
        }

        if(ch>=1 && ch<=4)
        {
            switch(ch)
            {
                case 1:
                System.out.println("Enter the amount you want to withdraw");
                System.out.println("Please enter amount in multiples of 100 or 500");
                double amt=ob.nextDouble();

                cus_bal[v]-=amt;

                break;

                case 2:
                System.out.println("Enter the amount you want to deposit");
                double amt1=ob.nextDouble();

                cus_bal[v]+=amt1;

                break;

                case 3:
                System.out.println("Current balance in Mr./Mrs./Ms. "+cus_name[v]+" is "+cus_bal[v]);

                break;

                case 4:
                System.out.println("Thank You For Using Our Banking System");
            }
        }
        else
        {
            System.out.println("Wrong choice! ");
        }

        System.out.println();
        System.out.println();
        
        
        System.out.println("Details of your searched customer - ");
        System.out.println("Account holder's name -  "+cus_name[v]);
        System.out.println("Account holder's account number -  "+cus_acc_no[v]);
        System.out.println("Account holder's bank balance -  "+cus_bal[v]);
    }
}