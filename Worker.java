import java.util.*;
import java.io.*;
public class Worker
{
    String name;
    double Basic;
    Worker()
    {
        name=" ";
        Basic=0.0;
    }
    Worker(String r1, double r2)
    {
        name=r1;
        Basic=r2;
    }
    void display()
    {
          System.out.println("name of worker is"+ name);
          System.out.println("Wage of worker is"+ Basic);
    }
}
class Wages extends Worker
{
    double hrs;
    double rate;
    double wage;
    Wages(String name, double Basic, double hours, double rate)
    {
        super(name,Basic);
        this.hrs= hours;
        this.rate= rate;
        wage=0;
    }
    double overtime()
    {
        return (hrs * rate);
    }
    void display()
    {
        super.display();
        wage=overtime() + Basic;
        System.out.print("Wage= " + wage);
    }
}