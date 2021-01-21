package Journal_programs;
import java.io.*;
import java.util.*;
public class Q3_2019
{
    String fo="IO";
    public static void main()throws IOException
    {
        boolean valid=true;
        System.out.println("Enter a string which ends with '?','.' or '!' and is in uppercase");
        BufferedReader take=new BufferedReader(new InputStreamReader(System.in));
        String input=take.readLine();
        Q3_2019 obj=new Q3_2019();
        valid=validity(input);
        if(valid==true)
        {
            System.out.println("Input is valid.We'll continue the program");
            String result=generate(input);
            System.out.println("Input = "+input);
            System.out.println("Output = "+ result + input.charAt(input.length()-1));
        }
        else
            System.out.println("Program will now terminate");
    }   

    static boolean validity(String str)
    {
        char last=str.charAt(str.length()-1);boolean uppercase=true;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                uppercase=false;break;
            }
        }
        if(last!='?' && last!='!' && last!='.')
        {
            System.out.println("Plz enter a valid statement which terminates with specified characters");
            return false;
        }
        else if(uppercase!=true)
        {
            System.out.println("Plz enter a valid statement which is uppercase");
            return false;
        }
        else
            return true;
    }

    static String generate(String str)
    {
        str=str.substring(0,str.length()-1);
        int ei=-1;//end index of concurring letters from end
        StringTokenizer st=new StringTokenizer(str);String result=" ";
        while(st.hasMoreTokens())
        {
            String word=st.nextToken();
            char lastChar=word.charAt(word.length()-1);ei=-1;
            for(int i=word.length()-1;i>=0;i--)
            {
                if(word.charAt(i)==lastChar)
                ei=i;
                else
                break;
            }
            StringBuffer sb=new StringBuffer(word.substring(0,ei));
            sb.reverse();
            word=word.concat(String.valueOf(sb));
            result+=" " + word;
        }
            return result;
    }
}

        