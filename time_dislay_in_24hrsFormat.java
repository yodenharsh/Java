import java.util.*;
public class time_dislay_in_24hrsFormat
{
    int timeIn12hr;String AMPM;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert time in 12hr format");
        timeIn12hr=sc.nextInt();
        System.out.println("Insert AM/PM");
        AMPM=sc.next();
    }
    void process()
    {
        if(AMPM=="AM")
        {
            System.out.println("Time is " +timeIn12hr +"AM");
        }
        else if(AMPM=="PM")
        {
            timeIn12hr+=12;
            System.out.println("time is "+timeIn12hr+"PM");
        }
        else
        {
            System.out.println("Please type AM or PM when asked to");
        }
    }
}