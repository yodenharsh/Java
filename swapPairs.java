import java.util.Scanner;
public class swapPairs
{
    public void calculate(String fr)
    {
        Scanner gg=new Scanner(fr);String af, result="";int len=fr.length();char extra=' ';
        while(gg.hasNext())
        {
            result=" "+String.valueOf(extra) ;
            if(len%2==0)
            {
                for(int i=0;i<=len-1;i++)
                {
                    result+=(fr.substring(i+1,i+2)+fr.substring(i,i+1));
                    i++;extra=' ';
                }
            }
            else if(len%2==1)
            {
                extra=fr.charAt(len-1);
                for(int i=0;i<=len-2;i++)
                {
                    result=(fr.substring(i+1,i+2)+fr.substring(i,i+1));
                    i++;
                }
            }
            
            gg.next();
        }
        af=result.trim();
        System.out.println(af);
    }
    public static void main()
    {
        swapPairs obj=new swapPairs();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        obj.calculate(str);
    }
}