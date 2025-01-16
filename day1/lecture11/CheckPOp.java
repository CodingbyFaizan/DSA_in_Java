package day1.lecture11;

import java.util.Scanner;

public class CheckPOp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total elements you want to check");

        int total = sc.nextInt();

        int arr[] = new int[total];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("checking prime!");

        for(int n : arr){

            if(isPrime(n)){
                System.out.println(n + " is Prime!");
            }else{
                System.out.println(n + " not prime");
            }

        }

          
    } 

    private static boolean isPrime(int n){
        if(n == 1)
            return false;
        if(n == 2)
            return true;
        if(n % 2 == 0)
           return false;

        for(int j=3; j <= Math.sqrt(n); j++){
            if(n % j == 0){
                return false;
            }
            
        }
        return true;
    }   
}
