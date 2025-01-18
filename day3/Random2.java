package day3;

import java.util.Scanner;

public class Random2 {

    // 2. print reverse number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number!");
        int num = sc.nextInt();

        System.out.println("Before Reverse: " + num);

        System.out.print("After reverse: ");

       

        if (num == 0)
            System.out.println(0);
        else {
            int reverseNumber = 0;
            while (num > 0) {
                reverseNumber = reverseNumber * 10 + (num % 10);
                num = num / 10;
            }
            System.out.println(reverseNumber);
        }

        

        sc.close();

    }

}
