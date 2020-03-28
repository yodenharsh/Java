package array;


import java.util.Scanner;
public class volcanoSort
{
    String[] mArray;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements in array");
        int arrsize=sc.nextInt();String sArray[]=new String[arrsize];
        System.out.println("Enter name of volcanoes");

        for(int i=0;i<=sArray.length-1;i++)
        {
            sArray[i]=sc.next();
        }
        mArray=(sArray);
    }

    void arrange()
    {
        String temp;
        for(int i=0;i<=mArray.length-1;i++)
        {
            for(int j=0;j<=mArray.length-1-i;j++)
            {
                if(mArray[i].compareTo(mArray[j]) >0)
                {
                    temp=mArray[i];
                    mArray[i]=mArray[j];
                    mArray[j]=temp;
                }
            }}
        print();
    }

    void print()
    {
        for(int i=0;i<=mArray.length-1;i++)
        {
            System.out.println(mArray[i]);
        }
        System.out.println("");
    }
    public static void main()
    {
        volcanoSort obj=new volcanoSort();
        obj.input();
        obj.arrange();
    }
}
