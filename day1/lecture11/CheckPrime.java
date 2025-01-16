package day1.lecture11;

import java.util.Scanner;

// Check prime 

public class CheckPrime{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a total number you want to check for prime!");
        int total = sc.nextInt();
        int count = 0;

        for(int i=0;i<total;i++){
            int n = sc.nextInt();
            count = 0;

            for(int j=2; j <= n/2; j++){
                if(n % j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }

        }
        sc.close();

    }
}   