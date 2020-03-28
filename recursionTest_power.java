import java.util.*;
import java.io.*;
public class recursionTest_power
{
    int a,b;int output=0;
    void input()throws IOException
    {
        BufferedReader fs=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number and their power after it");
        a=Integer.parseInt(fs.readLine());
        b=Integer.parseInt(fs.readLine());
        int result=process(a,b);
        System.out.println(a +" raise to "+b +"= "+result);       
    }
    public int process(int num,int pwr)
    {
        if(pwr==1)
        return num;
        else
        {
            return (num*process(num,pwr-1));
        }
    }
    public static void main()throws IOException 
    {
        recursionTest_power obj=new recursionTest_power();System.out.println("W");
        obj.input();//What is the meaning of recursion,is it death or it setting kill to ppl????
    }
}