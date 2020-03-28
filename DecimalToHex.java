import java.util.Scanner;
class DecimalToHex
{
    public static void main()
    {
      Scanner input = new Scanner( System.in );
      System.out.print("Enter a decimal number : ");
      int num =input.nextInt();
        
      String str = Integer.toHexString(num);
      System.out.println("Method 1: Decimal to hexadecimal: "+str);
    }
}