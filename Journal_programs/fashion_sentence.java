package Journal_programs;
import java.util.*;
import java.io.*;

public class fashion_sentence
{
    String str; String fina1=" ";int pos[];   //String name is fina-1 and not final . Thus not a keyword
    public void input()throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        str=bf.readLine();
        System.out.println("Enter number of positions you want to change");
        int size=Integer.parseInt(bf.readLine());
        pos = new int[size];
        System.out.println("Enter those numbers");
        for(int i=0;i<=pos.length-1;i++)
        {
            pos[i]=Integer.parseInt(bf.readLine());
        }
        
    }
    public void getWord()
    {
        StringTokenizer st=new StringTokenizer(str);int len=st.countTokens();
        while(st.hasMoreTokens())
        {
            
           lab: for(int i=1;i<=len;i++)//check for matching word position and element from pos[]
            {
            for(int j=0;j<=pos.length-1;j++)
            
            {
                
                if(i==pos[j])
                {
                    fina1+= circulate(st.nextToken())+" ";continue lab;
                }
            }
            fina1+=st.nextToken() + " ";
        }
        System.out.println("Final statement : "+ fina1);
    }
    }
    public String circulate(String s)
    {
        StringBuffer sb=new StringBuffer(s); //to replace characters
        for(int i=0;i<=s.length()-1;i++)
        {
            char a=s.charAt(i);
            if(a=='Z' || a=='z')
            {     
                a=(char)(a-25);
                String b=String.valueOf(a);
                sb.replace(i,i+1,b);
            }
            else
            {
                a=(char)(a+1);
                String b=String.valueOf(a);
            sb.replace(i,i+1,b);
            }
        }
        return sb.toString();
    }
    public static void main()
    {
        fashion_sentence obj=new fashion_sentence();
        try{
        obj.input();obj.getWord();
        }
        catch(IOException e)
        {}
        
        
    }
}