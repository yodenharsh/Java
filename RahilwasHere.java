import java.util.Scanner;
public class RahilwasHere
{
    static void main()
    {
        System.out.println("Rahil was inside harsh's program.Rahil is harsh's friend");
        Scanner sc=new Scanner(System.in);
        
        try{
        System.out.println("Are you harsh's friend?1=Yes or 2=No");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("You r a nice person.God bless you");
        }
        else if(choice==2)
        {
            System.out.println("plz?");
            System.out.println("She said \"Hello!\" to me.");
            System.out.println("Get out of here plz.No one likes you");
            System.out.println("Rahil:Ok");
        }
        else
        {
            System.out.println("Your brain is invalid like the choice u entered");
        }
        }
        catch(java.util.InputMismatchException e)
        {
            System.out.println("Thanks for typing an invalid data type when u were supposed to type 1 or 2  Because of you,I had to program this exception handler");
    }
}}