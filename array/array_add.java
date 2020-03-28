package array;
import java.util.*;
public  class array_add
{
    int array1[]=new int[11];
    int array2[]=new int[11];
    int sumArray[]=new int[11];
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=0;i<=10;i++)
        {
            array1[i]=sc.nextInt();
        }
        for(int j=0;j<=10;j++)
        {
            array2[j]=sc.nextInt();
        }
    }
    
    
    public void calculate()
    {
         for(int i=0;i<=10;i++)
         {
             sumArray[i]=array2[i]+array1[i];
         }
    }
    public static void main()
    {
        array_add ob=new array_add();
        ob.input();
        ob.calculate();
    }
}