import java.util.*;
import java.io.*;
public class sTokenizer
{
    public static void main()
    {
        String str="sir I have a request for/you";
        StringTokenizer ok=new StringTokenizer(str,"/ ");int a=ok.countTokens();System.out.println(a);
        while(ok.hasMoreTokens())
        {
            String b=ok.nextToken();
            System.out.println(b);
        }
    }
}