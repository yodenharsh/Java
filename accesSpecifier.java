import java.util.Scanner;
public class accesSpecifier
{
    public static void main()
    {
        System.out.println("This is a public class");
    }
    class add
{
    public void main()
    {
        System.out.println("THIS IS ANOTHER PUBLIC CLASS");
        accesSpecifier obj=new accesSpecifier();
    }
}
}

