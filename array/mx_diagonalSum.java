package array;
import java.util.*;
public class mx_diagonalSum
{
    int [][]sArray;
    mx_diagonalSum(int rows,int coloums)
    {
        sArray=new int[rows][coloums];
    }
    void initialize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i=0;i<=sArray.length-1;i++)
        {
            for(int j=0;j<=sArray[i].length-1;j++)
            {
                sArray[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
    }
    void calculate()
    {
        int sum=0;
        for(int i=0;i<=sArray.length-1;i++)
        sum+=sArray[i][i];
        for(int i=0,j=sArray.length-1;i<=sArray.length-1;i++,j--)
        {
            if(i==j)
            continue;
            else
            sum+=sArray[i][j];
        }
        System.out.println("Sum = "+sum);
    }
    public static void main()
    {
        mx_diagonalSum obj=new mx_diagonalSum(3,3);
        obj.initialize();
        obj.calculate();
    }
}