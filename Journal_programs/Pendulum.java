package Journal_programs;
import java.util.*;

public class Pendulum
{
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       System.out.println("Enter elements");
       int []array=new int[size];
       input(array);
       sort(array);
       int []copy=new int[size];
       for(int i=0;i<=copy.length-1;i++)//to copy by value
       {
           copy[i]=array[i];
       }
       int[] Pendulum=pendulum(array,copy);
       System.out.println("Pendulum array: ");
       display(Pendulum);
   }
   private static void input(int []array)
   {
       Scanner in=new Scanner(System.in);
       for(int i=0;i<=array.length-1;i++)
       {
           array[i]=in.nextInt();
       }
   }
   private static void sort(int array[])
   {
       int temp=0;
       for(int i=0;i<=array.length-2;i++)
       {
           for(int j=i+1;j<=array.length-1;j++)
           {
               if(array[i]>array[j])
               {
                   temp=array[i];
                   array[i]=array[j];
                   array[j]=temp;
                }
            }
        }
   }
   private static int[] pendulum(int array[],int copy[])
   {
       if((array.length%2)==1)//for odd number of elements
       {
           copy[array.length/2]=array[0];int k=1;
           for(int i=array.length/2-1,j=array.length/2 +1;i>=0;i--,j++)
           {
               copy[i]=array[k];
               copy[j]=array[k+1];k+=2;
            }
        }
       else if((array.length%2)==0)//for even number of elements
       {
           int k=0;
           for(int i=array.length/2-1,j=array.length/2;i>=0;i--,j++)
           {
               copy[i]=array[k];
               try{               
               copy[j]=array[k+1];
               }
               catch(Exception e){
                   break;}
               k+=2;
           }
       }
       return copy;
   }
   private static void display(int []array)
   {
       for(int i=0;i<=array.length-1;i++)
       {
             System.out.print(array[i]+ " ");
       }
   }
}   