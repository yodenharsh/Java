import java.util.Scanner;
public class happyNumber
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked for happy number");
        n=sc.nextInt();
    }

    void check()
    { 
        int sum=0;int num=n;int temp=n;
        while(temp>9)//While number is not a single digit number
        {
            int factorSum=0;num=temp;
            while(num!=0)
            {
                factorSum+=(int) (Math.pow((num%10),2));
                num=num/10;
            }
            temp=temp/10;
        }
        if(temp==1)
        {
            System.out.println("Number is happy");
        }
        else
        System.out.println("It's unhappy :(");
    }
    public static void main()
    {
        happyNumber obj=new happyNumber();
        obj.input();
        obj.check();
    }
}