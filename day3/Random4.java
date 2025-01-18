package day3;

import java.util.Scanner;

public class Random4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nth position");
        int n = sc.nextInt();

        fibo(n);
        sc.close();
    }

    private static void fibo(int n) {
        int first = 0;
        int second = 1;
        int third;

        if(n >= 1) {
            System.out.print(first + " ");
        }
        if(n >= 2) {
            System.out.print(second + " ");
        } 

        for (int i = 3; i <= n; i++) {
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }            

        }

    }


