import java.util.Scanner;
public class ShortAdds
{
      short num1;short num;short num2;
      public void input()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number to be spotted.Enter in divisions of 3");
          num=sc.nextShort();
          num1=sc.nextShort();
          num2=sc.nextShort();
        }
      public void sort()
      {
           int sorted=0;
           if(num>num1 && num>num2 && num2>num1 )
           {
             sorted=num+num2+num1;
            }
           else if(num1>num && num1>num2 && num>num2)
           {
               sorted+=num1+num+num2;
            }
           System.out.println("Sorted answer is "+sorted);
        }
      public static void main()
      {
          ShortAdds obj=new ShortAdds
          ();
          obj.input();
          obj.sort();
        }
    }