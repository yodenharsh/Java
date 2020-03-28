package array;
import java.util.Scanner;
public class minMax_matrix
{
    int [][]sArray;
    void input()
    {
        System.out.println("Enter number of sub-arrays");
        Scanner sc=new Scanner(System.in);
        int arrSize=sc.nextInt();
        System.out.println("Enter sub-array size");
        int subSize=sc.nextInt();
        sArray=new int[arrSize][subSize];
        input.mx_input(sArray);
    }
    public void calculate()
    {
       int prime=0;int min=9212112;int max=0;boolean p=true;
       for(int i=0;i<=sArray.length-1;i++)
       {
           prime=0;min=91121219;max=0;
           for(int j=0;j<=sArray[i].length-1;j++)
           {
               p=true;
               for(int k=2;k<=sArray[i][j]-1;k++)
               {
                   if(sArray[i][j]%k==0)
                   p=false;break;
               }
               if(p==true)
               prime++;
               if(sArray[i][j]>max)
                   max=sArray[i][j];
               if(sArray[i][j]<min)
                   min=sArray[i][j];
           }
           System.out.println("Prime numbers in "+i+ "th sub-array = "+prime);
           System.out.println("Minimum number in "+i+"th sub-array = "+min);
           System.out.println("Maximum number in "+i+"th sub-array = "+max);
        }
    }
    public static void main()
    {
        minMax_matrix obj=new minMax_matrix();
        obj.input();
        obj.calculate();
    }
}