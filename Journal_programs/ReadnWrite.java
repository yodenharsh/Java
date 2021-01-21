package Journal_programs;
import java.io.*;
import java.util.*;
public class ReadnWrite
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);int choice;
        do
        {
            System.out.println("1.Write to file 2.Read from file 3.Exit");
            choice=sc.nextInt();
            try{

                switch(choice) 
                {

                    case 1:Write();break;
                    case 2:Read();break;
                    case 3:break;
                    default: System.out.println("Ented valid response");

                }                
            }
            catch(IOException e)
            {
            }
        }while(choice!=3);
    }

    private static void Read()throws IOException 
    {try {
            FileReader reader = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Write()throws IOException
    {
        try {
            FileWriter writer = new FileWriter("file.txt", true);
            Scanner sc=new Scanner(System.in);System.out.println("Type: ");
            writer.write(sc.nextLine());
                    writer.write("\r\n");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
 