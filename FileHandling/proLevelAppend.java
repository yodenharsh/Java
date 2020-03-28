package FileHandling;
import java.io.*;
public class proLevelAppend
{
     static String in;
    public void input()throws IOException
    {
        BufferedReader fs=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type something that you want to append to file.txt");
        in=fs.readLine();
        
    }
    
    public static void main()throws IOException
    {
        proLevelAppend obj=new proLevelAppend();
        FileWriter fw=new FileWriter("file.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        obj.input();
        pw.println(in);
        pw.close();
        bw.close();
        fw.close();
    }
}