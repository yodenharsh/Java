import java.io.*;
import java.util.*;
public class datePrograms
{
    int in1,mon1,year1,in2,mon2,year2;String date;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter whole date in DD/MM/YY format");
        date=sc.next();
        
    }
    void calculate()
    {
          StringTokenizer st=new StringTokenizer(date,"/");int i=0;
          while(st.hasMoreTokens())
          {
              String temp=st.nextToken();
              if(i==0)
              {
                  System.out.println("Today is "+ temp);
                }
                else if(i==1)
                {
                    String[] sArray= {"january","febuary","march","april","march","april","june","july","august","september","october","november","december"};
                    try{
                    String b=sArray[(Integer.parseInt(temp))];
                    System.out.println("Month is "+b);
                       }
                    catch(ArrayIndexOutOfBoundsException e)
                    {
                    System.out.println("Enter valid month");   
                    }
                 
                }
                else if(i==2)
                {
                    System.out.println("Year is "+ temp);
                }
                i++;
            } 
    }
    public static void main()
    {
          datePrograms obj=new datePrograms();
          obj.input();
          obj.calculate();
    }
}   