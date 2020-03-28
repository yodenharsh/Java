package array;
import java.util.*;
public class binSearch_recursion
{
    String []sArray=new String[6];
    int []mArray=new int[6];
    public void input()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter reference index");
         for(int i=0;i<=sArray.length-1;i++)
         {            
                 sArray[i]=sc.next();
         }
         System.out.println("Enter elements(integers) to be searched");
         for(int j=0;j<=mArray.length-1;j++)
         {
             mArray[j]=sc.nextInt();
         }
         System.out.println("Enter integer to match");
         int search=sc.nextInt();int index=0;
         int returnValue=process(search,index);
         if(returnValue==-1)
         System.out.println("Value not found");
         else
         System.out.println(search +" found at index "+returnValue+" with corresponding element "+sArray[returnValue]);
    }
    public int process(int search,int i)
    {
        if(i>mArray.length-1)
        return -1;
        else if(search==mArray[i])
        return i;
        else
        return process(search,(i+1));
    }
    public static void main()
    {
        binSearch_recursion obj=new binSearch_recursion();
        obj.input();
    }
}