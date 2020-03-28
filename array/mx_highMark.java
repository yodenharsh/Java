package array;
import java.util.Scanner;
public class mx_highMark
{
    String [][]main;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Plz enter number of students");
        int no=sc.nextInt();main=new String[no][no];
        System.out.println("Enter student's name along with total marks");
        int i=0;
        while(i<=(no-1))
        {
            main[0][i]=sc.nextLine();
            main[1][i]=sc.next();i++;
        }
    }
    void process()
    {
        int max=0;int i;
        for(i=0;i<=main[0].length-1;i++)
        {
            int s=Integer.parseInt(main[1][i]);
            if(s>max)
            max=s;
        }
        System.out.println(max +" are the maximum marks scored by "+main[0][i]);
    }
    public static void main()
    {
        mx_highMark obj=new mx_highMark();
        obj.input();
        obj.process();
    }
}