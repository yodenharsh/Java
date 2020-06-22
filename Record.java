import java.util.*;
import java.io.*;
class Record //superclass
{
    String name[];
    int mk[];
    Record()
    {
        name=new String[50];
        mk=new int[50];
    }
    void readvalues()throws IOException
    {
        BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<50;i++)
        {
            System.out.println("Enter name and rank");
            name[i] = B.readLine();
            mk[i]=Integer.parseInt(B.readLine());
        }
    }
    void display()
    {
            System.out.println("The names and ranks are -");
            for(int i=0;i<50;i++)
            {
                System.out.println(name[i] +" "+ mk[i]);
            }
        }
 }
class Rank extends Record
    {
        int index;
        Rank()
        {
            super();
            index=0;
        }
        void most()
        {
            int max=mk[0];
            for(int i=0;i<50;i++)
            {
                if(mk[i]>max)
                {
                    index=i;
                }
            }
        }
        void display()
        {
            super.display();
            System.out.println("Top rank:"+ mk[index]);
            System.out.println("Name of that student"+ name[index]);
        }
    }
   
    
    