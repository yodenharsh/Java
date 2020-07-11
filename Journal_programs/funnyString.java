package Journal_programs;

import java.util.Scanner;
import java.io.*;
public class funnyString
{
    String str=" ",reverse=" ";
    public void input()
    {
        System.out.println("Enter the string(in one case)");
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer(sc.next());
        str=sb.toString();
        sb.reverse();
        reverse=sb.toString();
    }
    public void extractCharacters()
    {
        for(int i=0;i<=str.length()-2;i++)
        {
            int diff1=checkEqual(str.charAt(i),str.charAt(i+1));
            int diff2=checkEqual(reverse.charAt(i),reverse.charAt(i+1));
            if(diff1!=diff2)
            {
                System.out.println("Not funny");break;
            }
            if(i==str.length()-2)
            System.out.println("Very funny");
        }
    }
    private int checkEqual(char a,char b)
    {
        int difference=a-b;
        return Math.abs(difference);
    }
    public static void main()
    {
        funnyString obj=new funnyString();
        obj.input();
        obj.extractCharacters();
    }
}