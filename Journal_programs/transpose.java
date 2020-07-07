package Journal_programs;

import java.util.Scanner;
public class transpose
{
    int [][]arr;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("give the order of matrix");
        int n=sc.nextInt();
        arr=new int[n][n];
        System.out.println("Enter the matirx");
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr[i].length-1;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    public void transpose()
    {

        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr[i].length-1;j++)
            {
                System.out.print(arr[j][i]);
            }
            System.out.println(" ");
        }
    }

    public static void main()
    {
        transpose obj=new transpose();
        obj.input();
        obj.transpose();

    }
}