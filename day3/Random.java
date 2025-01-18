package day3;

import java.util.Scanner;

// 1. print prime between range 
// 2. print reverse number
// 3. print the number in same order one by one
// 4. print fibonacci till nth position


public class Random{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start value");
        int start = sc.nextInt();

        System.out.println("Enter end value");
        int end = sc.nextInt();

        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    private static boolean isPrime(int num){

        if(num == 1)
            return false;
        if(num == 2)
            return true;
        if(num % 2 == 0){
            return false;
        }
        else{
            for(int j = 3; j<=Math.sqrt(num); j=j+2){
                if(num % j == 0)
                    return false;
            }
        }

        return true;
    }

}