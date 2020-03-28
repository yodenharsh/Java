import java.util.Scanner;
public class swap
{
    String input;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        input=sc.nextLine();
    }

    void calculate()
    {
        int si = 0, ei = 0;int len=input.length();
        
        while (ei <= len)  
        { 
            if (ei < len && input.charAt(ei) != ' ') 
            { 
                ei++; 
            }  
            else
            { 
                int curr_length = ei - si; String b="";
                String a=String.valueOf(input.charAt(ei-1)); 
                String c=String.valueOf(input.charAt(si));
                if(curr_length>1){
                    b=input.substring(si+1,ei-1);System.out.print(a+b+c+" ");
                }
                else if(curr_length==1)
                {
                    b=String.valueOf(input.charAt(si));System.out.print(b+" ");
                }

                ei++; 
                si = ei; 
            } 
        } 
    }

    public static void main()
    {
        swap obj=new swap();
        obj.input();
        obj.calculate();
    }
}