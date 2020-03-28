import java.util.*;
public class Q1_2018
{
    String str;
    public void input()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a sentence");
         str=sc.nextLine();
    }
    public void processs()
    {
         StringTokenizer st=new StringTokenizer(str);
         while(st.hasMoreTokens())
         {
               String ok=st.nextToken();
               int vowels=0;
               for(int i=0;i<=ok.length()-1;i++)
               {
                     char c=str.charAt(i);
                     if(c=='a' || c=='e' || c=='u' || c=='o' || c=='i' || c=='A' || c=='O' || c=='E' || c=='I' || c=='U')
                     vowels++;
               }
               System.out.println(ok + " has "+ vowels+ " vowels ");
         }
    }
    public static void main()
    {
        Q1_2018 obj=new Q1_2018();
        obj.input();
        obj.processs();
        System.out.println("Thank you for using this program");
    }
}          