package Revisionday1;

import java.util.Scanner;

// Print fibo

public class Ques8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the position n : ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        if (n >= 1) {
            System.out.print(first + " ");
        }
        if (n >= 2)
            System.out.print(second + " ");

        for (int i = 2; i < n; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

        sc.close();

    }
}
