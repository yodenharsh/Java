package array;


import java.util.Scanner;
public class arry_sort
{
    String []sArray;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int arsize=sc.nextInt();
        sArray=new String[arsize];
        System.out.println("Enter string values");
        for(int i=0;i<=sArray.length-1;i++)
        {
            sArray[i]=sc.next();
        }
    }

    void sort()
    {
        String s=" ";
        for(int i=0;i<=sArray.length-1;i++)
        {
            for(int j=0;j<=sArray.length-2;j++)
            {
                if(sArray[i].compareTo(sArray[j])>0)
                {
                    s=sArray[i];
                    sArray[i]=sArray[j];
                    sArray[j]=s;
                }
            }
        }
        display();
    }

    void display()
    {
        for(int i=0;i<=sArray.length-1;i++)
        {
            System.out.print(sArray[i]+ " ");
        }
    }

    public static void main()
    {
        arry_sort ob=new arry_sort();
        ob.input();
        ob.sort();
    }
}