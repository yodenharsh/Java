package Journal_programs;
import java.util.*;
import java.io.*;
class Goldbach{
    public static void main(String args[])
    throws IOException{
        int n = 0;
        int p = 3;
        int q = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("N = ");
        n = Integer.parseInt(br.readLine());
        if(n % 2 != 0){
            System.out.println("Invalid input. Number is odd.");
            return;
        }
        else if(n < 10 || n > 49){
            System.out.println("Invalid input. Number is out of range.");
            return;
        }
        System.out.println("Prime pairs are:");
        while(p < n){
            q = n - p;
            if(isPrime(p) && isPrime(q) && p <= q)
                System.out.println(p + ", " + q);
            p += 2;
        }
    }
    public static boolean isPrime(int n){
        int f = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                f++;
        }
        if(f == 2)
            return true;
        return false;
    }
}