import java.util.HashMap;
import java.util.Map;
import java.io.*; 
public class CountWordTest {
    public static void main()throws IOException {
        BufferedReader fs =new BufferedReader(new InputStreamReader(System.in));
        String str=fs.readLine();
        CountWordTest obj=new CountWordTest();
        obj.countWords(str);
    }
 
    public void countWords(String input) {
        Map <String, String> map = new HashMap <String, String> ();
 
        if (input != null) {
            String[] separatedWords = input.split(" ");
            for (String str: separatedWords) {
                if (map.containsKey(str)) {
                    int count = Integer.parseInt(map.get(str));
                    map.put(str, String.valueOf(count + 1));
                } else {
                    map.put(str, "1");
                }
            }
        }
        System.out.println("Input = "+input);
        System.out.println("Count :- " + map);
    }
 
}