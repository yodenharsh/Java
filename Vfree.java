import java.util.Scanner;
public class Vfree
{
    String str;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to check fir vfree sentence");
        str=sc.nextLine();
    }
    void check()
    {
        Scanner sc=new Scanner(str);boolean vfree=false;
        lab: while(sc.hasNext())
        {
            String word=sc.next();
            for(int i=0;i<=word.length()-1;i++)
            {
                char a=Character.toUpperCase(word.charAt(i));
                if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
                {
                    vfree=true;
                    break lab;
                }
            }
            
            sc.next();
        }
        if(vfree==true)
        {
            System.out.println("String "+ str + " is vfree");
        }
        else if(vfree==false)
        System.out.println(str +"          isn't vfree");
    }
    public static void main()
    {
        Vfree obj=new Vfree();
        obj.input();
        obj.check();
    }
}
        
                
    
        