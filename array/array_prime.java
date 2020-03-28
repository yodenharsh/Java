package array;

import java.util.Scanner;
public class array_prime
{
    int []sArray;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int arrsize=sc.nextInt();
        sArray=new int[arrsize];
        System.out.println("Enter array elements");
        for(int i=0;i<=sArray.length-1;i++)
        {
            sArray[i]=sc.nextInt();
        }
    }
    void checkPrime()
    {
        int count;
        for(int i=0;i<=sArray.length-1;i++)
        {
            count=0;int num=sArray[i];
            for(int j=1;i<=num;i++)
            {
                if(num%j==0)
                count++;
            }
            System.out.println(num +" is a prime number");
        }
    }
    public static void main()
    {
        array_prime obj=new array_prime();
        obj.input();
        obj.checkPrime();
    }}
    