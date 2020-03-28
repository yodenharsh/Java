import java.util.Scanner;
public class decToBinary
{
    
    
    public int calculate(int num)
    {
        int temp=num;int q=temp;int remainder=0;String str="";String reverse="";
        while(temp!=0)
        {
            remainder=q%2;
            q=q/2;
            temp=q;
            str=str+remainder;
        }
        StringBuffer sb=new StringBuffer(str);sb.reverse();str=sb.toString();return Integer.parseInt(str);
}
public static void main()
{
    decToBinary obj=new decToBinary();Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    obj.calculate(n);
}
}
    