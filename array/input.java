package array;
import java.util.Scanner;
public class input
{
    public static void input(int array1[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        for(int i=0;i<=10;i++)
        {
            array1[i]=sc.nextInt();
        }
    }
    public static void mx_input(int sArray[][])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=sArray.length-1;i++)
        {
            for(int j=0;j<=sArray[i].length-1;j++)
            sArray[i][j]=sc.nextInt();
            System.out.println("");
        }
    }
}