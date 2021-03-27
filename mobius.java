//for BlueJ IDE
import java.util.*;
public class mobius
{
    int num;int[] prime=new int[5000];int numCopy;

    boolean input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();numCopy=num;
        if(num==1)
        {
        System.out.println("1 = 1 \n NO PRIME FACTORS \n M(1)=1");return false;
        }
        return true;
    }
    void factorize()
    {
        int extract=0;//to extract a prime 'i'
        int primePosition=0;
        while(num!=1)
        {
            
            for(int i=2;i<=num;i++)
            {
                if(num%i==0)                
                {                    
                    extract=i;
                    num=num/i;
                    break;
                }
            }            
            prime[primePosition]=extract;
            primePosition++;
            
        }
    }
    void opsOnPrime()
    {
        int len=0;//no. of prime numbers
        boolean repeat=false;//if a number repeats itself
        for(int i=0;i<=prime.length-1;i++)
        {
            if(prime[i]==prime[i+1] && prime[i]!=0)
            {
                repeat=true;
                
            }
            if(prime[i]==0)//for finding no. of prime elements 
            {
                len=i;break;
            }
        }
        if(repeat==true)        
        display(true,len);
        else
        display(false,len);
    }
    void display(boolean repeat, int len)
    {
        System.out.print(numCopy + " = "+ prime[0]);
        for(int i=1;i<=len-1;i++)
        {
            if(i==0)
            break;
            System.out.print("x "+ prime[i]);
        }
        System.out.println( " ");
        if(repeat==true)//if factors repeat 
        {
            System.out.println("Duplicate prime factors \n M("+numCopy+") = 0");
        }
        else
        {
            System.out.println("Number of distinct prime factors = "+len);
            System.out.println("M(" +numCopy+")= "+ Math.pow(-1,len));
        }
    }
    public static void main()
    {
        mobius obj=new mobius();
        boolean notOne=obj.input();
        if(notOne==true)
        {
                obj.factorize();
                obj.opsOnPrime();
            }
        }
    }               