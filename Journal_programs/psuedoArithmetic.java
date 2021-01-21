package Journal_programs;
import java.util.*;
public class psuedoArithmetic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of numbers in series");
        int size=sc.nextInt();int []series=new int[size];
        input(series);
        check(series);
    }
    private static void input(int []series)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter all numbers one by one");
        for(int i=0;i<=series.length-1;i++)
        {
            series[i]=in.nextInt();
        }
    }
    private static void check(int []series)
    {
        int i=0;int j=series.length-1;boolean psuedoArithmetic=true;int sum=series[i]+series[j];
        while(i!=j && i!=j-1)
        {
            if(sum!=(series[i]+series[j]))
            psuedoArithmetic=false;
            i++;j--;
        }
        if(psuedoArithmetic==true)
        System.out.println("Psuedo-Arithmetic");
        else
        System.out.println("Not pseudo-arithmetic");
    }
}
                