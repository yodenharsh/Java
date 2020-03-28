import java.util.Scanner;
public class pronicNumber
{
    int num;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check for pronic number");
        num=sc.nextInt();
    }
    void calculate()
    {
        int con1;int con2;boolean pronic=false;
        for(int i=0;i<=num;i++)
        {
            int product=i*(i+1);con1=i;con2=i+1;
            if(product==num)
            {
                System.out.println(num+ "is a pronic number with product of "+ con1 +"and "+con2);pronic=true;
                break;
            }
        }
        if(pronic==false)
        {
            System.out.println(num+" is not a pronic number");
        }
    }
    public static void main()
    {
        pronicNumber obj=new pronicNumber();
        obj.input();
        obj.calculate();
    }
}
        