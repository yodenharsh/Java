import java.util.Scanner;
public class patternMenu
{
    int n;
    public void backwards()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of time");
        n=sc.nextInt();

        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    void diamond()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of time");
        n=sc.nextInt();
                for (int i = 1; i <= n; i++)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    void numberAfterNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of times");
        int rows=sc.nextInt();
        int temp = 0;//stores value of j
        for (int i = rows; i >= 1; i--)
        {
            for (int j = rows ; j >= i; j--)
            {
                System.out.print(j + " ");
                temp =j;
            }
            for (int k = rows - i+1; k < rows; k++)
            {
                System.out.print(temp + " ");
            }
            System.out.println();
        } 
    }  
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter pattern u want to make - 1.backwards  2.diamond 3.number after number");
        int choice=in.nextInt();
        patternMenu obj=new patternMenu();
        if(choice==1)
            obj.backwards();
        else if(choice==2)
            obj.diamond();
        else if(choice==3)
        obj.numberAfterNumber();
        else
        {
            System.out.println("Enter valid choice");
        }
    }}