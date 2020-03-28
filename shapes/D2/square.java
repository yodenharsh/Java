package shapes.D2;
import shapes.D3.*;
import java.util.Scanner;
public class square
{
    public static void main()
    {
        System.out.println("Square is a 2D shape");
        cube.say();
    }
    public void show()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length then breadth");
        int len=sc.nextInt();
        int bre=sc.nextInt();
        int area=len*bre;
        System.out.println("Area is "+area);
        
    }
}

