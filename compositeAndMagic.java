import java.util.Scanner;
public class compositeAndMagic
{
    static boolean happyNumber=false;static boolean composite=false;
    void composite(int num)
    {
        int half=num/2;int in1=0;int in2=0;
        labA: for(int i=1;i<=half;i++)
        {
            for(int j=num-1;j>=half;j--)
            {
                if(j*i==num)
                {
                   in1=j;in2=i;
                   break labA;
                }
            }
        }
        if(in1==0 && in2==0)
        {
            System.out.println("Number isn't composite");
        }
        else{
            composite=true;
            System.out.println("Number is composite and integers are "+in1 + "and "+in2);
        }
    }
    void happy(int n)
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
            
            happyNumber=true;
        }
       
    }
    public static void main()
    {
        compositeAndMagic obj=new compositeAndMagic();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check for composite and magic");
        int f=sc.nextInt();
        obj.happy(f);
        obj.composite(f);
        if(happyNumber==true && composite==true)
        {
            System.out.println("Number is happy and composite");
        }
        else if(happyNumber==false && composite==true)
        System.out.println("Not happy but composite");
        else if(happyNumber==true && composite==false)
        System.out.println("Number is not composite but happy");
        else
        System.out.println("Unhappy and not composite");
    }
}