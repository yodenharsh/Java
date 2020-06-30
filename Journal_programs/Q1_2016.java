package Journal_programs;

import java.util.*;
class Q1_2016{
    public static boolean isPrime( int number ){
        int factorCount = 0;
        if( number < 2 ) 
        return false;
        else if( number == 2 ) 
        return true;
        else if( number % 2 == 0 ) 
        return false;
        else{
            int limit = (int) Math.sqrt( number );
            for( int i = 3 ; i <= limit ; i+=2 ){
                if( number %i == 0 ){
                    return false;
                }
            }
        }
        return true;
    }

    public static int circulate( int n, int divisor ){
        //left most digit is n/divisor;
        //remainder after removing left most is n%divisor;
        if( n < 10 ) 
            return n; 
        else return ( n % divisor ) * 10 + n / divisor; 
    } 

    public static void main(){ 
        int N, digit; 
        Scanner sc = new Scanner( System.in ); 
        System.out.print("INPUT: N= "); 
        N = sc.nextInt(); 
        int numOfDigits = 0, divisor=1, circular=N; 
        boolean allPrime = true, isValidDigit=true; 
        for( int temp = N; temp > 0; temp /= 10 ){
            numOfDigits++;
            divisor *=10;
            digit=temp%10;
            if( !(digit==1 || digit==3 || digit==7 || digit==9) ) {
                isValidDigit=false;
                break;
            }
        }
        if(!isValidDigit && numOfDigits>=2){
            System.out.println( N + " Is not a circular prime " );
        }else{
            divisor /=10;
            System.out.println( "OUTPUT: " );
            do{
                System.out.println( "        "+circular );
                circular = circulate( circular, divisor );
                if( !isPrime( circular ) )
                    allPrime=false;
            }while( circular != N );
            System.out.print( "\n        " );
            if( allPrime ) System.out.println( N + " Is a circular prime" );
            else System.out.println( N + " Is not a circular prime" );
        }
    }}
