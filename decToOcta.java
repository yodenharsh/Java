import java.util.Scanner;
public class decToOcta
{
    int num;String str="";String reverse="";
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
    }
    void calculate()
    {
        int temp=num;int q=temp;int remainder=0;
        while(temp!=0)
        {
            remainder=q%8;
            q=q/8;
            temp=q;
            str=str+remainder;
        }
        for(int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
}
public static void main()
{
    decToOcta obj=new decToOcta();
    obj.input();
    obj.calculate();
}
}
    