package Journal_programs;


import java.util.*;
public class stringPairAndHasAllCharacters
{
    String []set1;String []set2;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input size for both String arrays");
        int size=sc.nextInt();
        set1=new String[size];
        set2=new String[size];
        System.out.println("Enter Strings for set 1 (all in lowercase)");
        inputloop(set1);
        System.out.println("Enter Strings for set 2 (all in lowercase)");
        inputloop(set2);
    }
    public void inputloop(String []set)
    {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<=set.length-1;i++)
        {
             set[i]=in.next();
        }
    }
    public void extractConcate()
    {
           String str1=" ",str2=" ",finalstr=" ";int strings=0;
           for(int i=0;i<=set1.length-1;i++)
           {
                 str1=set1[i];
                 for(int j=0;j<=set1.length-1;j++)
                 {
                       str2=set2[j];
                       finalstr=str1.concat(str2);
                       boolean isOK=checkForValidity(finalstr);
                       if(isOK==true)
                       {
                           System.out.println(finalstr);strings++;
                       }
                 }
           }
           System.out.println("Number of outputs = "+strings);
    }
    public boolean checkForValidity(String str)
    {
        boolean isOk=false;
        for(int i=97;i<=122;i++)
        {
            isOk=false;
            for(int j=0;j<=str.length()-1;j++)
            {
                if(str.charAt(j)==i)
                {
                    isOk=true;break;
                }
            }
            if(isOk==false)
            return false;
        }
        return true;
    }
    public static void main()
    {
        stringPairAndHasAllCharacters obj = new stringPairAndHasAllCharacters();
        obj.input();
        obj.extractConcate();
    }
}
            