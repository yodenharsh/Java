import java.util.Scanner;
public class evilNumber
{
    public static void main()
    {
        evilNumber obj=new evilNumber();
        System.out.println("Enter a number between 3-99");
        Scanner sc=new Scanner(System.in);
        int dec=sc.nextInt();
        boolean isOk=checkIfOk(dec);
        if(isOk==false)
       {System.out.println("Enter a valid number");main();}
       else if(isOk==true)
       {
           decToBinary io=new decToBinary();
           int bin=io.calculate(dec);
           boolean evil=checkEvil(bin);
           if(evil==true)
           System.out.println(dec+" is an evil number");
           else
           System.out.println(dec+" isn't an evil number");
       }
    }
    private static boolean checkIfOk(int num)
    {
        if(num>2 && num<100)
        return true;
        return false;
    }
    private static boolean checkEvil(int num)
    {
        String s=String.valueOf(num);int noOf1=0;
        for(int i=0;i<=s.length()-1;++i)
        {
            if(s.charAt(i)=='1')
            noOf1++;
        }
        if(noOf1%2==0)
        return true;
        else
        return false;
    }
}