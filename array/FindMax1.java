package array;
import java.util.*;
public class FindMax1
{
    int sArray[][];
    FindMax1(int [][]array)
    {
        sArray= array;
    }
    public void find()
    {
        int rowWithMax=0; int max1=0; //rowWithMax is for required row while max1 stores maximum 1s observed during process
        int ones=0; //stores number of ones in observed row
        for(int i=0;i<=sArray.length-1;i++)
        {
            ones=0;//observed ones becomes 0 before scanning the next row
            for(int j=0;j<=sArray[i].length-1;j++)
            {
                if(sArray[i][j]==1)
                ones++;
            }
            if(max1<ones)
            {
            max1=ones;rowWithMax=i;
            }
        }
        System.out.println("row with max ones is the "+ rowWithMax+ " row");
        
    }
    private static int[][] inputing()
    {
        int array[][];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of row and coloum respectively");
        int row=sc.nextInt();
        int coloumn=sc.nextInt();
        array=new int[row][coloumn];
        System.out.println("Enter elements");
        for(int i=0;i<=array.length-1;i++)
        {
            for(int j=0;j<=array[i].length-1;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        return array;
    }
    public void display()
    {
        System.out.println("Matrix : ");
        for(int i=0;i<=sArray.length-1;i++)
        {
            
            for(int j=0;j<=sArray[i].length-1;j++)
            {
                System.out.print(sArray[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
    public static void main()
    {
        int [][]input;
        input=inputing();
        FindMax1 obj=new FindMax1(input);
        obj.display();
        obj.find();
    }
}