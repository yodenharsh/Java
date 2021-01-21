import java.util.*;

public class automorphic
{
    int num;int digit=0;

    public static void main(String args[])
    {
        automorphic obj=new automorphic();
        obj.input();
        obj.calculate();
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
    }

    void calculate()
    {
        int square=num*num;int temp=num;
        while(temp!=0)
        {
            digit++;
            temp=temp/10;
        }
        String b=Integer.toString(square);
        int len=b.length();
        String a=Integer.toString(num);
        String c=b.substring((len-digit),len);
        if(b.endsWith(a))
        {
            System.out.println("Automorphic number");
        }
        else
        System.out.println("not automorphic number");
    }
}