import java.util.*;
public class Q8_2016
{
    int mat[][];
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and coloums where , m<5");
        int m=sc.nextInt();
        mat= new int[m][m];         
        System.out.println("Enter each element of  mat array");
        for(int i=0;i<=mat.length-1;i++)
        {
            for(int j=0; j<=mat[i].length-1;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter value of P to shift");
        int P=sc.nextInt();
        cyclic(P);
    }
    public void cyclic(int P)
    {
        for(int i=0;i<P;i++)
        {
            int []temp=mat[0];
            for(int j=1;j<=mat.length-1;j++)
            {
                mat[j-1]=mat[j];
            }
            mat[mat.length-1]=temp;
        }
    }
    public void display()
    {
        for(int i=0;i<=mat.length-1;i++)
        {
            for(int j=0;j<=mat.length-1;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main()
    {
        Q8_2016 obj =new Q8_2016();
        obj.input();
    }
}