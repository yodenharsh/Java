package Journal_programs;
import java.util.*;
public class SpiralMatrix
{
    int [][]array;
    public static void main()
    {
        SpiralMatrix obj=new SpiralMatrix();
        obj.input();
        obj.display();
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array?");
        int size=sc.nextInt();array=new int[size][size];
        System.out.println("Enter elements");
        int i=0;int jLimit=array.length-1;
        int j=0;int iLimit=array.length-1;
        int Dir=1;int start=0;
        int count=size*size;
        while(count>=0)
        if(Dir==1)
        {
        for(j=start-1;j<=jLimit;j++)
        {
            if(j==-1)
            j=0;
            array[i][j]=sc.nextInt();count--;
        }
        j--;
        for(i=start+1;i<=iLimit;i++)
        {
            array[i][j]=sc.nextInt();count--;
        }
        i--;
        Dir=-1;
        }
        else if(Dir==-1)
        {
            for(j=jLimit-1;j>=start;j--)
            {
                array[i][j]=sc.nextInt();count--;
            }
            jLimit--;start++;j++;
            for(i=iLimit-1;i>=start;i--)
            {
                array[i][j]=sc.nextInt();count--;
            }
            iLimit--;Dir=1;i++;
        }
    }
    public void display()
    {
        for(int i=0;i<=array.length-1;i++)
        {
            for(int j=0;j<=array.length-1;j++)
            {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}