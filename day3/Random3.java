package day3;

import java.util.Scanner;

// 3. print the number in same order one by one

public class Random3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number!");
        int num = sc.nextInt();


        /*-------------------------------------------- */
        System.out.println("Count Digits of " + num);
        int count = 0;
        int temp = num;
        while(num > 0){
            num = num/10;
            count++;
        }
        // System.out.println(count);
        /*-------------------------------------------- */


        /*-------------------------------------------- */
        int div = (int) Math.pow(10, count-1);
        /*-------------------------------------------- */


        if(temp == 0){
            System.out.println(0);
        }
        else{
            while (div > 0) {
                System.out.println( temp / div);
                temp = temp % div;
                div = div / 10;
            }
        }

        sc.close();


    }    
}
