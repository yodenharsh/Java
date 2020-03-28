import java.util.*;
public class Q3
{
    public static boolean eligible(String str)
    {
        char last=(str.charAt(((str.length()-1))));//last character  CHANGE
        if(last!='.' && last!='?' && last!='!')
        {
            return false;
        }
        for(int i=0;i<=str.length()-2;i++)//exluding last character
        {
            if(Character.isUpperCase(str.charAt(i))==true || str.charAt(i)==' ')
            {
                continue;
            }//loop will restart if character is uppercase
            else
            {
                return false;
            }
        }
        return true;
    }
    public static int CountPalindrome(String str)
    {
        Scanner ln=new Scanner(str);int count=0;
        while(ln.hasNext())
        {
              String s=ln.next();// extracting word by word
              StringBuffer workcopy=new StringBuffer(s);// to work with
              String reverse=workcopy.reverse().toString();
              if(reverse.equals(s)==true)
              {
                  count++;
                }//ending while loop
            }
        return count;
    }
    public static void main()
{
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
boolean isOk=eligible(input);
if(isOk==true)
{
input=input.substring(0,(input.length()-1));//to eliminate last
int num=CountPalindrome(input);
if(num==0)
{
    System.out.println("No palindrome words");
}
else if(num>0)
{
    System.out.println("Number of palindromic words:"+num);
}
}
else if(isOk==false)
{
    System.out.println("Enter valid input");
}
}
}