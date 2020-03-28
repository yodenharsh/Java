package array;
import java.util.*;
public class mx_minMax
{
    int [][]array;
    void input()
    {
        int sub,size;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many subrows and then size of each subrows");
        sub=sc.nextInt();size=sc.nextInt();
        array=new int[sub][size];
        System.out.println("Enter elements");
        for(int i=0;i<=array.length-1;i++)
        {
            for(int j=0;j<=array[i].length-1;j++)
                array[i][j]=sc.nextInt();
        }
    }

    void process()
    {
        int max=-2147483648   ; 
        int min=2147483647;
        for(int i=0;i<=array.length-1;i++)
        {
            for(int j=0;j<=array[i].length-1;j++)
            {
                if(array[i][j]>max)
                    max=array[i][j];
                if(array[i][j]<min)
                    min=array[i][j];
            }
        }
        System.out.println("Max value = "+max);
        System.out.println("Min value = "+min);
    }

    public static void main()
    {
        mx_minMax ob=new mx_minMax();
        ob.input();
        ob.process();
    }
}       