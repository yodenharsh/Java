package Journal_programs;


import java.util.Scanner;
public class printMatrixInZigzagFashion
{
    int [][]mat;int M[][] = { 
        {1, 2, 3, 4},     {5, 6, 7, 8},     {9, 10, 11, 12}, 
        {13, 14, 15, 16}, {17, 18, 19, 20}};
    public void input()
    {
        System.out.println("Enter the row and coloumn of matrix");
        Scanner sc=new Scanner(System.in);
        
       
    }
    public void print1()
    {
        for(int a=0;a<=M.length-2;a++)
        {
            int j=0;
            for(int i=a;i>=0;i--)
            {
                
                if(i==0 && j==0)
                {
                    System.out.print(M[0][0]);
                }
                else if(i-1!=-1)
                {
                    System.out.print(M[i][j] + " ");
                    j++;
                }
                else if(i-1==-1)
                {
                    System.out.print(M[i][a]);
                }
            }
            System.out.println(" ");
        }
        
    }
    public void print2()
    {
        for(int a=0;a<=M[0].length-1;a++)
        {
            int j=a;
            for(int i=M.length-1;i>=j-2;i--)
            {
                if(i==M.length-1 && a==M[i].length-1)
                {
                    System.out.print(M[i][a]);break;
                }
                else if(i-1!=-1)
                {
                    try{
                    System.out.print(M[i][j]+ " ");
                    j++;}
                    catch(Exception e)
                    {}
                }
                else if(i-1==-1)
                {
                    System.out.print(M[i][a]+" ");
                }
            }
            System.out.println(" ");
        }
        
    }
    public static void main()
    {
        printMatrixInZigzagFashion obj=new printMatrixInZigzagFashion();
        obj.input();
        obj.print1();
        obj.print2();
    }
}