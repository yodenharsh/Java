package array;
import java.util.Scanner;
public class sortMatrix
{
    public static void main()
    {
        System.out.println("Enter number of rows(2<N<10)");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("Enter number of coloums");
        int M=sc.nextInt();
        boolean chkr=checkRange(N,M);
        if(!chkr)
        {
            System.out.println("Plz enter the values that are in the range");main();
        }
        else
        {
            int [][]sArray=new int[M][N];
            mx_input(sArray);
            sortArray(sArray);
        }
    }

    private static boolean checkRange(int N,int M)
    {
        if(2>N || 10<N)
            return false;
        else if(2>M || 10<M)
            return false;
        else
            return true;
    }

    private static void sortArray(int [][]sArray)
    {
        for (int i = 0; i < sArray.length; i++) {

            // loop for column of matrix
            for (int j = 0; j < sArray[i].length; j++) {

                // loop for comparison and swapping
                for (int k = 0; k < sArray[i].length - j - 1; k++) {
                    if (sArray[i][k] > sArray[i][k + 1]) {

                        // swapping of elements
                        int t = sArray[i][k];
                        sArray[i][k] = sArray[i][k + 1];
                        sArray[i][k + 1] = t;
                    }
                }
            }

        }display(sArray);
    }

    private static void display(int [][]sArray)
    {
        for(int i=0;i<=sArray.length-1;i++)
        {
            for(int j=0;j<=sArray[i].length-1;j++)
            {
                System.out.print(sArray[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void mx_input(int sArray[][])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=sArray.length-1;i++)
        {
            for(int j=0;j<=sArray[i].length-1;j++)
                sArray[i][j]=sc.nextInt();
            System.out.println("");
        }
    }

}

