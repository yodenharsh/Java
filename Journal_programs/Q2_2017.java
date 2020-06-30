package Journal_programs;

import java.util.*;
class Q2_2017
{
    char A[][],K[];
    int S[],n;
     
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of participants : ");
        n = sc.nextInt();
        if(n<4 || n>10)
        {
            System.out.println("INPUT SIZE OUT OF RANGE");
            System.exit(0);
        }
        A = new char[n][5]; // Array to store the answers of every participants
        K = new char[5]; // Array to store answer key
        S = new int[n]; // Array to store score of every participant
        System.out.println("\n* Enter answer of each participant row-wise in a single line *\n");
        for(int i = 0; i<n; i++)
        {
            System.out.print("Participant "+(i+1)+" : ");
            for(int j=0; j<5; j++)
            {
                A[i][j] = sc.next().charAt(0);
            }
        }
        System.out.print("\nEnter Answer Key : ");
        for(int i = 0; i<5; i++)
        {
            K[i] = sc.next().charAt(0);
        }
    }
 
    void CalcScore() // Function to calculate score of every participant
    {
 
        for(int i = 0; i<n; i++)
        {
            S[i] = 0;
            for(int j=0; j<5; j++)
            {
                if(A[i][j] == K[j]) // Checking if Answer of the participants match with the key or not
                                                                                                
                {
                    S[i]++;
                }
            }
        }
    }
 
    void printScore()
    {
        int max = 0;
        System.out.println("\nSCORES : ");
        for(int i = 0; i<n; i++)
        {
            System.out.println("\tParticipant "+(i+1)+" = "+S[i]);
            
         if(S[i]>max)
            {
                max = S[i]; // Storing the Highest Score
            }
        }
        System.out.println();
         
        System.out.println("\tHighest Score : "+max);
         
        System.out.println("\tHighest Scorers : ");
        for(int i = 0; i<n; i++) // Printing all those participant number who got highest score
        {
            if(S[i] == max)
            {
                System.out.println("\t\t\tParticipant "+(i+1));
            }
        }
    }
 
    public static void main(String args[])
    {
        Q2_2017 ob = new Q2_2017();
        ob.input();
        ob.CalcScore();
        ob.printScore();
    }
}