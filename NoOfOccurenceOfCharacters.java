import java.util.Scanner;
class NoOfOccurenceOfCharacters { 
    static final int MAX_CHAR = 256; 

    private static void getOccuringChar(String str) 
    { 

        int count[] = new int[MAX_CHAR]; // Create an array of size 256 i.e. ASCII_SIZE 

        int len = str.length(); 

        for (int i = 0; i < len; i++) // Initialize count array index 
            count[str.charAt(i)]++; 

        // Create an array of given String size 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 

                // If any matches found 
                if (str.charAt(i) == ch[j]) 
                    find++;				 
            } 

            if (find == 1) 
                System.out.println("Number of Occurrence of " + 
                    str.charAt(i) + " is:" + count[str.charAt(i)]);			 
        } 
    } 
    public static void main() 
    { 
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine(); 
        getOccuringChar(str); 
    } 
} 
