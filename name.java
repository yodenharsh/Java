import java.util.Scanner;
public class name
{
    StringBuffer fi=new StringBuffer();StringBuffer mi=new StringBuffer();StringBuffer la=new StringBuffer();
    String first;String middle;String last;
    void check()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name");
        first=sc.nextLine();
        fi=new StringBuffer(first);
        System.out.println("Enter your middle name");
        middle=sc.nextLine();
        mi=new StringBuffer(middle);
        System.out.println("Enter last name");
        last=sc.nextLine();
        la=new StringBuffer(last);
    }
    void generate()
    {
        StringBuffer result=new StringBuffer();StringBuffer dot=new StringBuffer(".");String f="";
        f=String.valueOf(fi.charAt(0))+String.valueOf(dot) +String.valueOf(mi.charAt(0))+ "."+String.valueOf(la);
        System.out.println(f);
    }
    public static void main()
    {
        name obj=new name();
        obj.check();
        obj.generate();
    }
}
