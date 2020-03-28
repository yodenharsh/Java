public class dateDisplay
{
    static int a,b,c;
    dateDisplay()
    {
        a=0;
        b=0;
        c=0;
    }
    dateDisplay(int day,int month,int year)
    {
        a=day;
        b=month;
        c=year;
    }
    public static void main()
    {
        int s=a;
        int t=b;
        
        int r=c;
        dateDisplay obj=new dateDisplay( s ,  t ,r);
        
        
    }
}
