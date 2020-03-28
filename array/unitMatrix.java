package array;
import java.util.Scanner;import array.input;
public class unitMatrix
{
    int [][]sArray;int [][]unit;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array and sub-array size");
        int arrsize=sc.nextInt();
        sArray=new int[arrsize][arrsize];unit=new int[arrsize][arrsize];
        System.out.println("Enter elements");
        input.mx_input(sArray);
        generate(arrsize);
    }
    void generate(int size)
    {
        for(int i=0;i<=size;i++)
        {
            for(int j=0;j<=size;j++)
            {
                if(i==j)
                unit[i][j]=1;
                else
                unit[i][j]=0;
            }
        }
    }
    public void check()
    {
        boolean lol;
        for(int i=0;i<=sArray.length-1;i++)
        {
            for(int j=0;j<=sArray[i].length-1;j++)
            {
                if(sArray[i][j]!=unit[i][j])
                lol=false;
                else
                continue;
            }
        }
        lol=true;
        if(lol==true)
        System.out.println(sArray +" is a unit matrix");
        else
        System.out.println("This is not a unit matrix");
    }
    public static void main()
    {
        unitMatrix obj=new unitMatrix();
        obj.input();
        obj.check();
    }
}