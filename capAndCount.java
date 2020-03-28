 import java.util.Scanner;
public class capAndCount
{
    String str;int con=0;int vow=0;String result="";String word;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
    }
    void print()
    {
        Scanner fs=new Scanner(str);
        while(fs.hasNext())
        {
            word=fs.next();
            con=Integer.parseInt(consonant(word));
            vow=Integer.parseInt(vowel(word));
            result=capitalize(word);
            System.out.println("Word = "+result + "      consonant count = "+con + " vowel count = "+ vow);
        }
    }
    public String consonant(String s1)
    {
        int concount=0;s1=s1.toUpperCase();
        for(int i=0;i<=s1.length()-1;i++)
        {
               if(s1.charAt(i)!='A' && s1.charAt(i)!='E' &&  s1.charAt(i)!='I' && s1.charAt(i)!='O' && s1.charAt(i)!='U')
               concount++;
        }
        String constring=String.valueOf(concount);return constring;
    }
    public static String vowel(String s1)
    {
        int vowcount=0;s1=s1.toUpperCase();
        for(int i=0;i<=s1.length()-1;i++)
        {
               if(s1.charAt(i)=='A' || s1.charAt(i)=='E' ||  s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U')
               vowcount++;
        }
        String vowstring=String.valueOf(vowcount);return vowstring;
    }
    public static String capitalize(String s1)
    {
        String go=Character.toUpperCase(s1.charAt(0)) + s1.substring(1,s1.length());
        return go;
    }
    public static void main()
    {
         capAndCount obj=new capAndCount();
         obj.input();
         obj.print();
    }
}