package Journal_programs;
import java.util.*;
import java.io.*;

public class specialFashion
{
    public static void main()
    {
        System.out.println("Input a string");
        Scanner sc=new Scanner(System.in);
        StringTokenizer str=new StringTokenizer(sc.nextLine());
        System.out.println("Enter the positions of word separated by comma");
        String position=sc.nextLine();
        StringTokenizer token=new StringTokenizer(position,",");
        while(token.hasMoreTokens())
        {
            int length=str.CountTokens();
            int lol=Integer.parseInt(token.nextToken);
            boolean valid=validity(length,lol);
            if(valid==false)
            {
               System.out.println("Please enter correct positions");main();
            }
            else
            {
                while(str.hasMoreTokens())
                {
                int i=0;
                String []a=ConvertString((str.nextToken().toString()));
                if(i+1==lol)
                {
                    a=cycle(a);
                }
                }
        }
    }
    }
    private static boolean validity(int length,int number)
    {
        if(length>=number)
        return true;
        return false;
    }
    private static String[] ConvertString(String str)
    {
        String a[]=new int[str.length-1];
        for(int i=0;i<=str.legnth-1;i++)
        {
            a[i]=str.charAt(i);
        }
    }
    private static String[] cycle(int a)
    {
        for(int i=0;i<=a.length-1;i++)
        {
            char b=a[i];
            short ascii=b;
            if(short!=
        

/*1.Start
2.Take the sentence from the user in String form
3.Input the positions of word to be replaced as StringTokenizer and set delimiter as ',' to get the indivisual numbers
4.Convert original String into array
5.Extract the nth word (where n is the word position) by user as StringBuffer
6.Analyze each letter of that word and replace by (ASCII code + 1)th character and for 'Z' , (ASCII cod - 27)
7.extractedStringWord.replace(i,result)
8.strArray[i]= extractedStringWord
9.Output final string using for(int i=0;i<=strArray.length-1;i++)
10.End*/ 