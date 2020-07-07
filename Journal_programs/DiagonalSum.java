package Journal_programs;

import java.util.Scanner;
public class DiagonalSum
{
    int [][]arr;
    public void input()
    {
        System.out.println("Enter order of matrix");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        arr=new int[N][N];
        System.out.println("Enter array elements");
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr[i].length-1;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            
        }
    }
    public void extractDiagonal()
    {
        int sum=0;
        for(int i=arr.length-1,j=arr.length-1;i>=0;i--,j--)
        {
            boolean prime = isPrime(arr[i][j]);
            if(prime==true)
            sum+=arr[i][j];
        }
        for(int i=arr.length-1,j=0;i>=0;i--,j++)
        {
            boolean prime = isPrime(arr[i][j]);
            if(prime==true)
            sum+=arr[i][j];
        }
        if(arr.length%2==1)
        {
            sum=sum-arr[arr.length/2][arr.length/2];
        }
        System.out.println("Sum of both diagonals is "+sum);
    }

    public boolean isPrime(int num)
    {
        int factor=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            factor++;
        }
        if(factor!=2)
        return false;
        return true;
    }
    public static void main()
    {
        DiagonalSum obj=new DiagonalSum();
        obj.input();
        obj.extractDiagonal();
    }
/*0.Start
1.Accept array from user
2.Use 2 different loops for extracting elements from both Diagonals . for(int i=arr.length-1,j=arr.length-1;i>=0;i--,j--) and for(int i=arr.length-1,j=0;i>=0;i--,j++)
3.Check if the element is prime by calculating its factors
4.If it is prime . Add it to int sum
5.At the end, subtract the middle element from sum to avoid 2 values of the mid element getting added if arr.legnth is an odd number
6.Display the sum
7.End*/
}