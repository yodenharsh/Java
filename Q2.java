import java.util.Scanner;
public class Q2
{
    public static void process(int c)
    {
        int a=c*c;
        String b=String.valueOf(a);
        int len=b.length();
        if(len>2 && len%2==1)
        {
        int LL=len/2;
        int RL=LL+1;
        String RHS=b.substring(0,RL+1);
        String LHS=b.substring(LL,len);
        LL=Integer.parseInt(LHS);
        RL=Integer.parseInt(RHS);
        if((RL+LL)==c)
        {
            System.out.println(c);
        }
        }
        else if(len%2==0)
        {
            int LL=len/2;
            int RL=LL;
            String RHS=b.substring(0,RL+1);
            String LHS=b.substring(LL,len);
            LL=Integer.parseInt(LHS);
            RL=Integer.parseInt(RHS);
        if((RL+LL)==c)
        {
            System.out.println(c);
        }
    }
}
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        for(int i=p;i<=q;i++)
        {
            process(i);
        }
    }
}