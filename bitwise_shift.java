import java.util.Scanner;
public class bitwise_shift
{
    short a=10;
    short b;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("a = 10 and b =");
        b=sc.nextShort();
    }
    void calculate()
    {
        int f=a>>b;
        System.out.println(f);
        f=a<<b;
        System.out.println(f);
        f=a>>>b;
        System.out.println(f);
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
    }
    public static void main()
    {
        bitwise_shift  fs=new bitwise_shift();
        fs.input();
        fs.calculate();
    }
}     