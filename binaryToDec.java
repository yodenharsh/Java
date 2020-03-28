import java.util.*;
public class binaryToDec
{
    int Bin;int Dec;int digit=0;
     void calculate()
    {
        Scanner sc=new Scanner(System.in);
        Bin=sc.nextInt();
        int temp=Bin;
        while(temp!=0)
        {
            temp=temp/10;
            digit++;
        }
        temp=Bin;
        int sum=0;int finalnum;
        for(int i=0;i<digit-1;i++)
        { 
            int num=Bin%10;
            sum=sum+(num+(int)Math.pow(2,(0+i)));
            Bin=Bin/10;
        }
        System.out.println("Binary to dec of "+temp +" is "+sum);
    }
    public static void main()
    {
        binaryToDec obj=new binaryToDec();
        obj.calculate();
}}
            
            
            
            