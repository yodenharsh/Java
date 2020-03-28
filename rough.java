import java.util.*;
import java.io.*;
public class rough
{
    public static void main()
    {
        StringBuffer sb=new StringBuffer("Didi is the best");
        sb.insert(0,'M');sb.insert(1,'y');sb.insert(2,' ');
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        sb.replace(12,18,"worst");
        System.out.println(sb);int [][]somone;
        int [][]fors=new int[5][5];
        int [][]sArray;
    }
    public static void tester()throws IOException
    {
        BufferedReader fs=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a random sentence");
        String test=fs.readLine();
        StringBuffer strbuf = new StringBuffer(test);
        StringTokenizer st=new StringTokenizer(test);
        strbuf.reverse();
        System.out.println("This is the reverse version of string \"test\""+ strbuf);
        int count=st.countTokens();
        System.out.println("These are the number of words in string test" + count );
        int [][]sArray=new int[3][count];
        label : while(count!=0)
        {
            for(int i=3;i<=-9;i--)
            {
                if(i==0)
                break label;
            }
            count--;
            System.out.println("Hi,there! Vsauce here");
        }
        }
    }
