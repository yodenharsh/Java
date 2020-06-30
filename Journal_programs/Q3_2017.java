package Journal_programs;
import java.util.*;

class Q3_2017
{
   public static void main(String args[])

   {

       int p=0,s=0;

       char a=0;


       Scanner sc=new Scanner(System.in);


       System.out.println("enter n");


       String n=sc.nextLine();


       n=n+" ";


       int l=n.length();


       if(l<3&&l>100)


        

{

          System.out.println("invalid");


        }


        else


        {


            for(int i=0;i<l;i++)


          {


                char ch=n.charAt(i);


                if(ch>='A'&&ch<='M')


                {


                p=ch+13;


                a=(char)p;


                System.out.print(a);


            }


            else if(ch>='N'&&ch<='Z')


        {


                s=ch-13;


               a=(char)s;


              System.out.print(a);


            }


                if(ch>='a'&&ch<='m')


            {


                p=ch+13;


                a=(char)p;


                System.out.print(a);


            }


            else if(ch>='n'&&ch<='z')

      {


                s=ch-13;


                a=(char)s;


                System.out.print(a);


}


                else


            {

                System.out.print(ch);


}


        }


    }


}


}