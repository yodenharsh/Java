import java.util.Scanner;
public class Bin2oct {
  public static void main(String args[]) {
    int binary;
    int rem;
    int decimal = 0;
    int octal = 0;
    int i = 1;
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a binary number: ");
    binary = sc.nextInt();
  
   
    while(binary != 0)
    {
       rem = binary % 10;
       decimal = decimal +(rem * i);
       binary = binary / 10;
       i = i * 2;
    }
   
    i = 1;
    while(decimal != 0)
    {
       rem = decimal % 8;
       octal = octal +(rem * i);
       decimal = decimal / 8;
       i = i * 10;
    }
    System.out.print("Octal number: "+octal);
  }
}