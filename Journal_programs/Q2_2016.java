package Journal_programs;

import java.util.*;
class Q2_2016
{
    int A[][],B[],m,n;

    void input() //Function for taking all the necessary inputs
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix : ");
        m=sc.nextInt();
        if(m<4 || m>10)
        {
            System.out.println("Invalid Range");
            System.exit(0);
        }
        else
        {
            A = new int[m][m];
            n = (m-2)*(m-2);
            B = new int[n]; //Array to store Non-Boundary Elements
             
            System.out.println("Enter the elements of the Matrix : ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print("Enter a value : ");
                    A[i][j]=sc.nextInt();
                }
            }
        }
    }
    void convert(int s)
    {
        int x=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i != 0 && j != 0 && i != m-1 && j != m-1)
                {
                    if(s==1)
                        B[x] = A[i][j];
                    else
                        A[i][j] = B[x];
                    x++;
                }
            }
        }
    }

    void sortArray() //Function for sorting Non-Boundary 
    {
        int c = 0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(B[i]>B[j])
                {
                    c = B[i];
                    B[i] = B[j];
                    B[j] = c;
                }
            }
        }
    }

    void printArray() //Function for printing the array A[][]
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void printDiagonal() //Function for printing the 
    {
        int sum = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j || (i+j)==m-1)
                {
                    System.out.print(A[i][j]+"\t");
                    sum = sum + A[i][j];
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("Sum of the Diagonal Elements : "+sum);
    }

    public static void main()
    {
        Q2_2016 ob = new Q2_2016();
        ob.input();

        System.out.println("The original matrix:");
        ob.printArray(); //Printing the original array
        ob.convert(1); //Storing Non-Boundary elements to a 1-D array
        ob.sortArray(); //Sorting the 1-D array 
        ob.convert(2); //Storing the sorted Non-Boundary elements back to original 2-D array

       
        System.out.println("The Rearranged matrix:");
        System.out.println("*********************");
        ob.printArray(); //Printing the rearranged array
        
        System.out.println("The Diagonal Elements:");
        
        ob.printDiagonal(); 
    }
}
