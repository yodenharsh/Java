package FileHandling;
import java.io.*;
public class Filewriter
{
    public static void main()throws IOException
    {
        FileWriter f1=new FileWriter("file.txt");
        f1.write("I am god");
        f1.write(10);
        f1.write("Actually,I am a noob");
        f1.close();
    }
}