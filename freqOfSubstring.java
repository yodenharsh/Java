import java.util.Scanner;
public class freqOfSubstring
{
    String str;String sub;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        str=sc.next();
        System.out.println("Enter a substring to check occurence of");
        sub=sc.next();
    }
    void check()
    {
        int count=0;int len=sub.length();
        for(int i=0;i<=str.length()-len;i++)
        {
            if(str.substring(i,i+len).compareTo(sub)==0)
            {
                count++;
            }
        }
        System.out.println("Occurence of "+sub+ " is "+count);
    }
    public static void main()
    {
        freqOfSubstring obj=new freqOfSubstring();
        obj.input();
        obj.check();
    }
}