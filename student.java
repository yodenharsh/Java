import java.util.Scanner;
public class student
{
    int maths;
    int science;
    int english;
    double avg;double percentage;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter maths marks");
        maths=sc.nextInt();
        System.out.println("Enter science marks");
        science=sc.nextInt();
        System.out.println("Enter english marks");
        english=sc.nextInt();
    }
    void calc()
    {
        avg=(maths+science+english)/3;
        System.out.println("Average of marks is "+avg);
        percentage=avg*100/30;
        System.out.println("percentage is "+percentage +"%");
    }
    public static void main()
    {
        student obj=new student();
        obj.accept();
        obj.calc();
    }
}
