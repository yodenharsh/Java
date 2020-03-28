package array;

import java.util.Scanner;
public class divisibleByX
{
    int []sArray;
    int max=0;
    int min=1000000;
    int count=0;
    int x;
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
        System.out.println("Enter a number to check for divisiblity");
        x=sc.nextInt();
    }

    void check()
    {
        for(int i=0;i<=sArray.length-1;i++)
        {
            if(sArray[i]%x==0)
            {
                count++;
                if(sArray[i]>max)
                    max=sArray[i];
                if(sArray[i]<min)
                    min=sArray[i];
            }
        }
        System.out.println("Number of elements divisible by "+x+" = "+count);
        System.out.println("Max value divisible by "+x+" = "+max);
        System.out.println("Minimum value divisble by "+x+" = "+min);
    }

    public static void main()
    {
        divisibleByX ob=new divisibleByX();
        ob.input();
        ob.check();
    }
}