package Journal_programs;
import java.util.Scanner;
public class Q2_2020
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows,0<M<10");
        int m=sc.nextInt();
        System.out.println("Enter number of coloums,where 2<N<6");
        int n=sc.nextInt();
        if(m>0 && m<10 && n>2 && n<6)
        {
            System.out.println("Enter an octal array");
            int [][]octal=new int[m][n];
            laba : for(int i=0;i<=octal.length-1;i++)
            {
                 for(int j=0;j<=octal[i].length-1;j++)
                 {
                     octal[i][j]=sc.nextInt();
                     if(octal[i][j]>7)
                     break laba;
                 }
                 
            }
             for(int i=0;i<=octal.length-1;i++)
            {
                 for(int j=0;j<=octal[i].length-1;j++)
                 {
                     int converted=conversion(octal[i]);
                     System.out.println(converted);
                 }
            }
        }
        else
        System.out.println("Enter correct values plz");
    }
    private static int conversion(int []octal)
    {
        String s="0";
        for(int i=0;i<=octal.length-1;i++)
        {
            int power=octal.length;
            s=s+String.valueOf(octal[i] *(Math.pow(8,power)));
            power--;
        }
        return Integer.parseInt(s);
    }
}
            
    
   
            