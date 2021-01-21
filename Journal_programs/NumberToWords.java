package Journal_programs;

import java.util.*;
public class NumberToWords
{
    String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                      "eighteen", "nineteen" };
	String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                      "sixty", "seventy", "eighty", "ninety" };
                      int num;
    public static void main()
    {
        NumberToWords obj=new NumberToWords();
        obj.input();
        obj.conversion();
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a number(upto 5 digits)");
        num=sc.nextInt();
    }
    public void conversion()
    {
        String StringNum= String.valueOf(num);String unit= " ",tens= " ",hundreds= " ",thousands= " ",ten_thousands=" ";
        if(num==0)
        System.out.println("Zero");
        else
        {
            int length=StringNum.length();
            for(int i=length-1;i>=0;i--)
            {
            if(i==length-1)
            unit=unitsArray[Integer.parseInt(String.valueOf(StringNum.charAt(length-1)))];
            else if(i==length-2)
            tens=tensArray[Integer.parseInt(String.valueOf(StringNum.charAt(length-2)))]; 
            else if(i==length-3)
            hundreds=unitsArray[Integer.parseInt(String.valueOf(StringNum.charAt(length-3)))]+ " hundred";
            else if(i==length-4)
            thousands=unitsArray[Integer.parseInt(String.valueOf(StringNum.charAt(length-4)))] + " thousand";
            else if(i==length-5)
            ten_thousands=tensArray[Integer.parseInt(String.valueOf(StringNum.charAt(length-5)))];
            }
            System.out.println("Converted sentence: " + ten_thousands + " "+ thousands + " " + hundreds + " "+ tens + " " + unit);
        }
    }
} 