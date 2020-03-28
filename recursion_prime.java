import java.util.*;
import java.io.*;
public class recursion_prime
{
    static int keep=0;
    static void input()throws IOException
    {
        BufferedReader fs=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter something to check for prime number");
        int num=Integer.parseInt(fs.readLine());
        int count=check(num,1);
        if(count==2)
        System.out.println("Prime number is this "+ num);
        else
        System.out.println("Not a prime number this is "+num);
    }
    public static int check(int n,int factor)
    {
        if(factor>n)
        return keep;
        else
        {
            if(n%factor==0)
                keep++;
            return check(n,factor+1);    
        }
    }
}