import java.util.*;
public class nextDate
{
    int month;int day;int year;
    int []month_day={31,28,31,30,31,30,31,31,30,31,30,31};
    public void input()
    {
        System.out.println("Enter day");
        Scanner sc=new Scanner(System.in);
        day=sc.nextInt();
        System.out.println("Enter month no.");
        month=sc.nextInt()-1;
        System.out.println("Enter year");
        year=sc.nextInt();
        System.out.println("Date entered is "+ day+"/"+(month+1)+"/"+year);
    }
    public void calculate()
    {
        if(day==31 && month==11)
        {
            year++;day=1;month=0;
        }
        else if((day+1)>month_day[month])
        {
            day=1;month++;
        }
        else
        {
            day++;
        }
        System.out.println("Next date is " + day + "/" + (month+1) + "/" + year);  
    }
    public static void main()
    {
        nextDate obj=new nextDate();
        obj.input();
        obj.calculate();
    }
}