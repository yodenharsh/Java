package Journal_programs;
import java.util.*;
public class romanToDecimal
{
    String roman;
    public static void main()
    {
        romanToDecimal obj=new romanToDecimal();
        obj.input();
        obj.conversion();
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter in Roman");
        roman=sc.nextLine();
    }
    public void conversion()
    {
        int decimal=0;
        for(int i=0;i<=roman.length()-1;i++)
        {
            char num=roman.charAt(i);
            if(num=='I')
            {
                if(roman.charAt(i+1)== 'X')
                {
                    decimal+=9;i++;
                }
                else if(roman.charAt(i+1)== 'V')
                {
                    decimal+=4;i++;
                }
                else
                decimal+=1;
            }
            else if(num=='V')
            decimal+=5;
            else if(num=='X')
            decimal+=10;
            else if(num=='L')
            decimal+=50;
            else if(num=='C')
            decimal+=100;
            else if(num=='D')
            decimal+=500;
            else if(num=='M')
            decimal+=1000;
        }
        System.out.println("Decimal value: "+decimal);
    }
}