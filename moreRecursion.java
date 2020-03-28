import java.util.*;
import java.io.*;
public class moreRecursion
{
    int ok=1;
    void input()throws IOException
    {
        System.out.println("Enter a number");
        BufferedReader fs=new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(fs.readLine());
        System.out.println("Enter product value to start with");
        int mult=Integer.parseInt(fs.readLine());
        int series=process(input,mult,0);
        System.out.println("Series = "+ series);
    }
    public int process(int limit,int pro,int n)
    {
        if(limit==0)
        return  0;
        else
        {
             System.out.println(ok+ "x "+pro+ " + "+n );
             ok++;
             return (process(limit-1,pro+1,n+1))*pro+n;
        }
    }
}
                     