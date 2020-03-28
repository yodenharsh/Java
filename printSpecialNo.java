import java.util.Scanner;
public class printSpecialNo
{
    public static void main()
    {
        int temp=0;int sum=1;int finalsum=0;
        for(int i=1;i<=150;i++)

        {
            temp=i;
            while(temp>0)
            {
                int digit=temp%10;
                sum=1;
                for(int j=1;j<=digit;j++)
                {
                    sum=sum*j;
                }
                finalsum=sum+finalsum;temp=temp/10;
            }
            if(finalsum==i)
            {
                System.out.println(i+" Is a special number");
            }
            else
            {
                System.out.println(i+" Is not special");
            }   
            finalsum=0;
        }
    }   
}