import java.io.*;
public class exceptionHandlingTesting
{
    static String str;int x;boolean excpt=false;
    public void input(int s)throws IOException
    {
        try{
        x=Integer.parseInt(str);
    }
        catch(NumberFormatException e)
        {
            System.out.println("Exception occured : "+ e);
            }
    finally{
        System.out.println("YOLO! WE TERMINATE THA PRAGRAM CUZ U ENTER A CHARACTER FOR SUM REZON");
    }
    }
    void display()
    {
        System.out.println("String u typed = "+str);
        if(excpt!=true)
        System.out.println("String u typed but it's an integer ="+x);
    }
    public static void main()throws IOException
    {
        System.out.println("Enter something");
        exceptionHandlingTesting obj=new exceptionHandlingTesting(); BufferedReader fs=new BufferedReader(new InputStreamReader(System.in));
        str=fs.readLine();int b=5;
        obj.input(b);
        obj.display();
    }
}