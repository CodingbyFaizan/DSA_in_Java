// package day2;

import java.util.Scanner;

public class PrintAllPrime {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking input start and end

        System.out.println("Enter the start value:");
        int start = sc.nextInt();

        System.out.println("Enter the end value:");
        int end = sc.nextInt();

        for(int i=start; i<=end; i++){
            if(isPrime(i))
                System.out.println(i);
            // else
            //     System.out.println(i + " is not prime");
        }

    }

    private static boolean isPrime(int n){

        if(n == 1)
            return false;

        if(n == 2)
            return true;

        if(n % 2 == 0)
            return false;
        
        
            for(int j=3; j<=Math.sqrt(n); j=j+2){
                if(n % j ==0)
                    return false;
            }
        

        return true;
    }

}
