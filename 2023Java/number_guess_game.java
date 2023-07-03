import java.util.*;
class number_guess_game
{
    int usernum=0;
    public static void main()
    {
        Scanner ob=new Scanner(System.in);

        number_guess_game x=new number_guess_game();

        System.out.println("Hello!  Hello!  Hello! "+"\n"+"Welcome back to another game");
        System.out.println("So, today we are going to play a number guessing game. Here, the system will generate a number and you have to guess it");
        System.out.println();

        System.out.println("Enter how many digits number u want to guess?");
        int size=ob.nextInt();//USER'S CHOICE OF HOW MANY DIGITS NUMBER IT SHOULD BE

        int mynum=(int)(Math.random()*(int)(Math.pow(10,size)));//SYSTEM GENERATED NUMBER

        System.out.println();

        System.out.println("THE GAME WILL CONTINUE UNTIL YOU ENTER ANY NEGATIVE NUMBER");

        System.out.println();

        while(x.usernum>=0)
        {
            try
            {
                System.out.print("Enter the number that you think the computer has generated ---  ");
                x.usernum=ob.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Please enter a number");
                continue;
            }

            System.out.println();
            System.out.println();
            
            
            if(x.usernum<0)
            {
                System.out.println("Sorry! But you could not win this game ");
                System.out.println("The number that was generated by the system is  ---  "+mynum);
                break;
            }
            
            
            
            else if(x.usernum==mynum)
            {
                System.out.println("! ! !  CONGRATULATIONS! YOU HAVE GUESSED THE CORRECT NUMBER AND HENCE YOU WIN THE GAME  ! ! !");
                break;
            }

            else if(x.usernum>mynum)
            {
                System.out.println("Sorry! The number which you have entered is greater than the number generated by the system ");
                
                System.out.println();
                System.out.println();
                System.out.println();
                
                
                
                continue;
            }

            else if(x.usernum<mynum)
            {
                System.out.println("Sorry! The number which you have entered is lesser than the number generated by the system ");
                
                
                System.out.println();
                System.out.println();
                System.out.println();
                
                
                
                continue;
            }

            
        }

        System.out.println("! ! !  THANK YOU FOR PLAYING OUR GAME. PLEASE DO COME AGAIN LATER  ! ! !");
    }
}