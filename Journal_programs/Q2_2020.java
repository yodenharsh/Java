package Journal_programs;

import java.util.*;
public class Q2_2020
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows M which is 0<M<10");
        int M=sc.nextInt();
        System.out.println("Enter number of coloums N which is 2<N<6");
        int N=sc.nextInt();
        if(M>0 && M<10 && N>2 && N<6)
        {
            int [][]octal=new int[M][N];
            System.out.println("Insert values (1 element at a time)");
            for(int i=0;i<=octal.length-1;i++)
            {
                System.out.print(i + " row : ");
                for(int j=0;j<=octal[i].length-1;j++)
                {
                      int c=sc.nextInt();
                      if(c>7)
                      break;
                      octal[i][j]=c;
                } 
                System.out.println(" ");
            }
            for(int i=0;i<=octal.length-1;i++)
            {
                int converted=convert(octal[i]);
                System.out.print("Decimal equivalent = " + converted);
                display(octal);
            }   }  
        else{
        System.out.println("Check M and N again");}
    }
    private static void display(int octal[][])
    {
        System.out.println("\n Original matrix");
        for(int i=0;i<=octal.length-1;i++)
        {
            System.out.println(" ");
            for(int j=0;j<=octal[i].length-1;j++)
            {
                System.out.print(octal[i][j] + " ");
            }
        }
    }

    private static int convert(int octal[])
    {
        int power=octal.length-1;int decimal=0;
        for(int i=0;i<=octal.length-1;i++)
        {
             decimal=decimal + (int) (octal[i] * Math.pow(8,power));
             power--;
        }
        return decimal;
    }
}

    