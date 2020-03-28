package array;
import java.util.Scanner;
public class mx_evenOdd
{
    int [][]sArray=new int[3][3];
    void input()
    {
        System.out.println("Enter a 3x3 integer matrix");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=sArray.length-1;i++)
        {
           for(int j=0;j<=sArray[i].length-1;j++)
           sArray[i][j]=sc.nextInt();
           System.out.println("");
        }
    }
    void process()
    {
        String even=" ";String odd=" ";
        for(int i=0;i<=sArray.length-1;i++)
        {
           for(int j=0;j<=sArray[i].length-1;j++)
           {
           if(sArray[i][j]%2==0)
           even+=sArray[i][j]+" ";
           else
           odd+=sArray[i][j]+ " ";
           }
        }
        System.out.println("Even numbers are "+even);
        System.out.print("Odd numbers are "+odd);
    }
    public static void main()
    {
        mx_evenOdd obj=new mx_evenOdd();
        obj.input();
        obj.process();
    }
}