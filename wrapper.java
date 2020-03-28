import java.util.Scanner;
public class wrapper
{
    String str;int a;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        str=sc.nextLine();
        System.out.println("Enter an integer");
        a=sc.nextInt();
    }
    public void calculate()
    {
        if(Character.isUpperCase(str.charAt(0)))
            System.out.println("First letter of string is uppercase");
        else if(Character.isLowerCase(str.charAt(0)))
        System.out.println("First letter of string is lowercase");
        else if(Character.isDigit(str.charAt(0)))
        {
            System.out.println("First character of string is digit i.e "+Integer.parseInt(String.valueOf(str.charAt(0))));
        }
        System.out.println(Integer.reverse(a));
    }
    public static void main()
    {
        wrapper obj=new wrapper();
        obj.input();
        obj.calculate();
    }
}