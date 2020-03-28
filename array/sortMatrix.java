package array;
import java.util.Scanner;
public class sortMatrix
{
    public static void main()
    {
        System.out.println("Enter number of rows(2<N<10)");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("Enter number of coloums");
        int M=sc.nextInt();
        boolean chkr=checkRange(N,M);
        if(chkr==false)
        {
            System.out.println("Plz enter the values that are in the range");main();
        }
        else
        {
            int [][]sArray=new int[M][N];
            input.mx_input(sArray);
            sortArray(sArray);
        }
    }
    private static boolean checkRange(int N,int M)
    {
        if(2>N || 10<N)
        return false;
        else if(2>M || 10<M)
        return false;
        else
        return true;
    }
    private static void sortArray(int [][]sArray)
    {
        int i=0;
        while(i<=sArray.length()-1)
        {
            for   
        }
}