import java.util.Scanner;
public class dash
{
    String str;StringBuffer buf=new StringBuffer("useful");
    void calculate() 
    {
        StringBuffer result=new StringBuffer();int q=buf.length();StringBuffer dash=new StringBuffer("-");String vow="";
        for(int i=0;i<q;i++)
        {
            result=result.append(buf.charAt(i)).append(dash);
        }
        result.deleteCharAt(result.length()-1);
        System.out.println(result);
        System.out.println(result.reverse());

    }   

    public static void main()
    {
        dash obj=new dash();
        obj.calculate();
    }
}