import java.util.*;

public class YARN
{
    String s;
    public void input()
    {
        System.out.println("Enter statement");
        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
    }
    public void extract()
    {
        s=s.toUpperCase();
        String result=" ";
        for(int i=0; i<=s.length()-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                result+=" ";
            }
            else if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                result+=vowel(s.charAt(i));
            }
            else
            {
                result+=cons(s.charAt(i));
            }
        }
        System.out.println(result);
        
    }
    public String vowel(char l)
    {
        l++;
        return String.valueOf(l);
    }
    public String cons(char l)
    {
        l--;
        return String.valueOf(l);
    }

public static void main()
{
    YARN obj = new YARN();
    obj.input();
    obj.extract();
}
}
        