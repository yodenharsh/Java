import java.util.Scanner;
public class generatePassword
{
    String first;String middle;String last;String age;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first-middle-last name");
        first=sc.nextLine();
        middle=sc.nextLine();
        last=sc.nextLine();
        System.out.println("Enter age");
        age=sc.nextLine();String lastEnd=String.valueOf(last.length()-1);
    }
    void calculate()
    {
        String age2="";
        String Lastpos=last.charAt(0) + String.valueOf(last.charAt((last.length()-1)));//first and last of last name
        String age1=String.valueOf(age.charAt(0));//first digit of age
        String Firstpos=first.charAt(0) + String.valueOf(first.charAt((first.length()-1)));//first and last of first name
        String Middle=middle.charAt(0) + String.valueOf(middle.charAt((middle.length()-1)));//first and last of first name
        if(age.length()==2)
        {
            age2=String.valueOf(age.charAt(1));//last digit of age
            String password =Lastpos + age1+ Firstpos + age2 + Middle;
            System.out.print("Password is "+password);
        }
        else
        {
            String password=Lastpos + age1+ Firstpos + Middle;
            System.out.println("Password is "+password);
        }
    }

    public static void main()
    {
        generatePassword obj=new generatePassword();
        obj.input();
        obj.calculate();
    }
}
 