package Journal_programs;


import java.util.*;
public class DiagonalBoundrySum
{
    int [][]arr;static int sum=0;
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
    public void BoundrySum()
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                if((i!=0 && j!=0) && (i!=arr.length-1 && j!=0) && (i!=0 && j!=arr.length-1) && (i!=arr.length-1 && j!=arr.length-1))
                {
                    if(i==0 || j==0 || i==arr.length-1 || j==arr.length-1)
                    {
                        
                        sum+=arr[i][j];
                    }
                }
            }
        }
    }
    public void display()
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main()
    {
       DiagonalBoundrySum obj = new DiagonalBoundrySum();
       obj.input();
       obj.extractDiagonal();
       obj.BoundrySum();
       obj.display();
       System.out.println("Sum is = " +sum);
    }
}