import java.util.*;
import java.io.*;
public class sumOfDigits_recursion
{
    int n;
    public void input()throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    try{
        System.out.println("Enter a number to find sum of digits of");
        n=Integer.parseInt(ob.readLine());    
       }
       catch(NumberFormatException e)
       {
           System.out.println("Please enter an integer");
           input();
       }
       int d=0;int temp=n;
        while(temp>0)
        {
            temp=temp/10;
            d++;
        }
        System.out.println("Sum of digits of "+n+" = "+ calculate(n,d));
    }

    public int calculate(int num,int digit)
    {
        int sum;
        if(digit==0)
            return num;
        else
            return num%10+calculate(num/10,digit-1);
    }
}