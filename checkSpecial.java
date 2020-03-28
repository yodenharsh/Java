import java.util.*;
public class checkSpecial
{

    int a;
    void input()
    {
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
    }

    void calc()
    {
        int sum=0;
        int temp=a;
        while(a>0)
        {
            int b=a%10;
            int fac=1;
            for(int i=1;i<=b;i++)
            {
                fac=fac*i;
            }
            sum=sum+fac;
            a=a/10;
        }
        if(temp==sum)
        {System.out.print("special");
        }
        else
        {
            System.out.println("not special");
        }
    }

    public static void main()
    {
        checkSpecial ob= new checkSpecial();
        ob.input();
        ob.calc();
    }
}
