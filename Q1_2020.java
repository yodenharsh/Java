import java.util.Scanner;
public class Q1_2020
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower value ,n");
        int n=sc.nextInt();
        System.out.println("Enter upper value ,m");
        int m=sc.nextInt();
        boolean inrange=inRange(n,m);
        if(inrange==false)
        {
            System.out.println("Plz enter values such that n < m");
            main();
        }
        else if(inrange)
        {
            System.out.println("Prime-adam numbers in given range are");
            for(int i=n;i<=m;i++)
            {
                  boolean prime=isPrime(i);
                  boolean adam=isAdam(i);
                  if(prime==true && adam==true)
                  System.out.print(i+ " w ");
            }
        }
    }
    private static boolean inRange(int n,int m)
    {
        if(n<m)
        return true;
        return false;
    }
    private static boolean isPrime(int n)
    {
        for(int i=2;i<=(n/2)-1;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    private static boolean isAdam(int n)
    {
        StringBuffer origRev = new StringBuffer(String.valueOf(n*n));
        int pwr=1;int revRev=0;
        while(n!=0)
        {
            int digit = n % 10;
            revRev = revRev * 10 + digit;
            n /= 10;
        }
        revRev=revRev*revRev;
        if(String.valueOf(origRev.reverse()).equals(String.valueOf(revRev)))
        return true;
        return false;
    }
}