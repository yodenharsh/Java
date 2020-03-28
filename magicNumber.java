import java.util.Scanner;
public class magicNumber
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked for magic number");
        n=sc.nextInt();
    }
    void check()
    {
          int sum=0,num=n;
        while(num>9)//until sum of factors in not single digit
        {
            sum=num;int s=0;
            while(sum!=0)//finding factors
            {
                s=s+(sum%10);
                sum=sum/10;
            }
            num=s;
        }
        if(num==1)
        {
            System.out.println(n+" is a Magic Number.");
        }
        else
        {
            System.out.println(n+" is not a Magic Number.");
        }
    }
    public static void main()
    {
        magicNumber obj=new magicNumber();
        obj.input();
        obj.check();
    }
}