package array;
import java.util.*;
public class DiagonalSwitch
{
    int [][]sArray;int []diagonal1;int []diagonal2;
    public void input()
    {
        System.out.println("Enter order of matrix NxN");
        Scanner sc=new Scanner(System.in);
        int order=sc.nextInt();
        sArray=new int[order][order];
        System.out.println("Enter the variables");
        for(int i=0;i<=sArray.length-1;i++)
        {
            for(int j=0;j<=sArray.length-1;j++)
            {
                sArray[i][j]=sc.nextInt();
            }
        }
        diagonal1=new int[order];diagonal2=new int[order];
    }
    public void findDiagonals()
    {
        for(int i=0,j=sArray.length-1;i<=sArray.length-1;i++,j--)
        {
            diagonal1[i]=sArray[i][i];
            diagonal2[i]=sArray[i][j];
        }
    }
    public void exchange()
    {
        for(int i=0,j=sArray.length-1;i<=sArray.length-1;i++,j--)
        {
            sArray[i][i]=diagonal2[i];
            sArray[i][j]=diagonal1[i];
        }
    }
    public void display()
    {
        System.out.println("Result matrix: ");
        for(int i=0;i<=sArray.length-1;i++)
        {
            System.out.println(" ");
            for(int j=0;j<=sArray.length-1;j++)
            {
                System.out.print(sArray[i][j]+ " ");
            }
        }
    }
    public static void main()
    {
        DiagonalSwitch obj=new DiagonalSwitch();
        obj.input();
        obj.findDiagonals();
        obj.exchange();
        obj.display();
    }
}