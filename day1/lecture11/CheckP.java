package day1.lecture11;

import java.util.Scanner;

public class CheckP {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number you want to check!");
        int total = sc.nextInt();

        int arr[] = new int[total];

        System.out.println("Enter the " + total + "elements:");

        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Checking for Prime!");

        for(int n : arr){
            boolean isPrime = true;
            if(n <=1 )
            {
                System.out.println("Not prime");
            }else {
                for(int k=2; k <= n/2;k++){
                    if(n % k == 0){
                        isPrime = false;
                        break;

                    }
                }
            }
            if(isPrime){
                System.out.println(n + " is prime");
            }else{
                System.out.println(n + " is not prime");
            }
        }





    }
}
