import java.util.Scanner;
public class sublime
{
    int num;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked for sublime number");
        num=sc.nextInt();
    }
    public void calculate()//find factors then check if no. of factors is perfect no. .Then check if sum of factors is perfect no.
    {
        int factors=0;int factorsum=0;int facfactorsum=0;int the2ndfactorsum=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                factorsum+=i;
                factors++;
            }
        }
        for(int i=1;i<factors;i++)
        {
            if(factors%i==0)
            facfactorsum+=i;
        }
        if(facfactorsum!=factors)
        {
            System.out.println("Not a sublime number");
        }
        for(int i=1;i<factorsum;i++)
        {
            if(factorsum%i==0)
             the2ndfactorsum+=i;
        }
        if(factorsum!=the2ndfactorsum)
        {
            System.out.println("Not a sublime number");
        }
        else{
            System.out.println("12 is a sublime number");
        }
    }
    public static void main()
    {
        sublime obj=new sublime();
        obj.input();
        obj.calculate();
    }
}