package array;
import java.util.*;
public class matrix
{
    int [][]sArray=new int[3][5];
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=sArray.length-1;i++)
        {
            System.out.println("Type 5 numbers for "+(i+1)+"th sub-array");
            for(int j=0;j<=sArray[i].length-1;j++)
            sArray[i][j]=sc.nextInt();
            System.out.println("");
        }
    }
    void display()
    {
       System.out.println("Array is ");System.out.println("");
       for(int i=0;i<=sArray.length-1;i++)
       {
          for(int j=0;j<=sArray[i].length-1;j++)
          {
            System.out.print(sArray[i][j]+" ");
          }
          System.out.println("");
       }
    } 
    public static void main()
    {
        matrix obj=new matrix();
        obj.input();
        obj.display();
    }
}  