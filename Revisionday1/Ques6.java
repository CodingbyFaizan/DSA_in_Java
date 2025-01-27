package Revisionday1;

public class Ques6 {

    private static boolean checkPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if(n % i == 0)
                return false;
        }

        return true;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        System.out.print("[ ");
        for (int x : arr) {
            if (checkPrime(x)) {
                System.out.print(" " + x + " ");
            }
        }

        System.out.print(" ]");

    }
}
