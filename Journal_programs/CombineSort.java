package Journal_programs;
import java.util.*;
public class CombineSort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size for both the arrays");
        int size=sc.nextInt();
        int []array1=new int[size];
        int []array2=new int[size];
        int []array3=new int[size+size];
        input(array1);input(array2);
        merge(array1,array2,array3);
        sort(array3);display(array3);
    }
    private static void input(int []arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements for the array:");
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    private static void merge(int arr1[],int arr2[], int arr3[])
    {
        for(int i=0;i<=arr1.length-1;i++)
        {
            arr3[i]=arr1[i];
            arr3[i+arr1.length]=arr2[i];
        }
    }
    private static void sort(int arr[])
    {
        int temp;
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)//selection sort
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    private static void display(int arr[])
    {
        System.out.println("Sorted array: ");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}