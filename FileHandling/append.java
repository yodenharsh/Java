package FileHandling;
import java.io.*;
public class append
{
    public static void main()throws IOException
    {
        BufferedReader fs=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter something to append to file.txt");
        String input=fs.readLine();
        FileWriter f1=new FileWriter("file.txt",true);
        f1.append("\n "+input);
        f1.close();
    } 
}