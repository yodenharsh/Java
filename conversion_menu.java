import java.util.Scanner;
public class conversion_menu
{
   static  int ch;
    int digit=0;
    public void binary()
    {
        int Bin=0;
        Scanner sc=new Scanner(System.in);
        Bin=sc.nextInt();
        int temp=Bin;
        while(temp!=0)
        {
            temp=temp/10;
            digit++;
        }
        temp=Bin;
        int sum=0;int finalnum;
        for(int i=0;i<digit-1;i++)
        { 
            int num=Bin%10;
            sum=sum+(num+(int)Math.pow(2,(0+i)));
            Bin=Bin/10;
        }
        System.out.println("Binary to dec of "+temp +" is "+sum);
    }

    public void decimal()
    {
        Scanner in=new Scanner(System.in);
        int Octa=in.nextInt();
        int temp=Octa;
        while(temp!=0)
        {
            temp=temp/10;
            digit++;
        }
        temp=Octa;
        int sum=0;int finalnum;
        for(int i=0;i<digit-1;i++)
        { 
            int num=Octa%10;
            sum=sum+(num+(int)Math.pow(8,i));
            Octa=Octa/10;
        }
        System.out.println("Octal to dec of "+temp +" is "+sum);
    }

    public void hexadecimal()
    {
        Scanner me=new Scanner(System.in);
        String hexa=me.next();
        String temp=hexa;int sum=0;StringBuffer sb=new StringBuffer(hexa);
        {
            for(int i=0;i<hexa.length()-1;i++)
            {
                int r= hexa.charAt(i);
                if(r==65)
                {
                    sb.setCharAt(i,'1');
                }
                if(r==66)
                {
                    sb.setCharAt(i,'a');
                }
                if(r==67)
                {
                    r=12;
                }
                if(r==68)
                {
                    r=13;
                    
                }
                if(r==69)
                {
                    r=14;
                }
                if(r==70)
                {
                    r=15;
                }
                sum=sum+(r+(int)Math.pow(16,i));System.out.println(sum);
            }
        }
    }
    public static void main()
    {
        conversion_menu obj=new conversion_menu();
        Scanner f=new Scanner(System.in);
        ch=f.nextInt();System.out.println("Enter choice ,1-2");
        if(ch==1)
        {
            obj.binary();
}
else if(ch==2)
{
    obj.decimal();
}
else if(ch==3)
{
    obj.hexadecimal();
}
else 
{
    System.out.println("Enter nice");
}
}
}