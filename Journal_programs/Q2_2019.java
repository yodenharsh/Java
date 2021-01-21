package Journal_programs;
import java.util.*;
class Q2_2019
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter");
int N=sc.nextInt();
if(N<2||N>10)
{
System.out.println("MATRIX SIZE OUT OF RANGE");
}
else
{
int a[]=new int[1000];
int b[][]=new int[100][100];
System.out.println("ENTER ELEMENT OF SINGLE DIMENSIONAL ARRAY:");
for(int i=0;i<N;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<N;i++)
{
for(int j=0;j<N-i-1;j++)
{
if(a[j]>a[j+1])//bubble sort
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
///for printing sorted array....
System.out.print("SORTED ARRAY :");
for(int i=0;i<N;i++)
{
System.out.print(a[i]);
}
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
if(j<N-i)
b[i][j]=a[j];
else
b[i][j]=a[j-(N-i)];
}
}
System.out.println("FILLED MATRIX");
for(int i=0;i<N;i++)
{
for(int j=0;j<N;j++)
{
System.out.print(b[i][j]);
}
System.out.println();
}
}
}
}