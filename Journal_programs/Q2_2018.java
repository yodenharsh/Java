package Journal_programs;
import java.util.*;
public class Q2_2018
{
    void sort(int a[])      //Taking  single dimension array as parameter
    {
        int i, j, n = a.length, tmp;        //a.length gives the number of values in the 1D array
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)            //Sorting using bubble sort technique
            {
                if(a[j]>a[j+1])
                {
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    void display(int a[][])     //Taking 2D array as parameter
    {
        int i, j;
        for(i=0;i<a.length;i++)     //a.length here gives the number of rows
        {
            for(j=0;j<a[i].length;j++)  //a[i] gives one row at a time. a[i].length gives the number of values in each row
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void Q2_2018(int a[][])
    {       //As arrays are reference data types any changes made to the formal parameter in this function.
        //Will be reflected in the original parameter.
        int i, j;
        for(i=0;i<a.length;i++)
        {
            sort(a[i]);     //Taking each row and passing each to sort function as a single dimension array
        }
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Q2_2018 obj = new Q2_2018();
        int a[][], m, n, i, j;
        System.out.println("Enter the number of rows: ");
        m = sc.nextInt();       //Input the size
        System.out.println("Enter the number of columns: ");
        n = sc.nextInt();
        if(m<3||m>9||n<3||n>9)
        {
            System.out.println("Matrix out of range");
            System.exit(0);     //Terminating the program
        }
        a = new int[m][n];      //Allocating memory
        System.out.println("Enter the values for the matrix: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        obj.display(a);     //Displaying array before sorting
        obj.Q2_2018(a);      //Calling sort function
        System.out.println("Matrix after sorting rows: ");
        obj.display(a);     //Display after sort function has executed
    }
}