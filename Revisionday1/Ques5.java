package Revisionday1;

// Check Prime 

public class Ques5 {
    private static void checkPrime(int no) {
        boolean flag = true;

        if (no == 1)
            flag = false;
        if (no == 2)
            flag = true;
        if (no % 2 == 0)
            flag = false;
        for (int i = 3; i < Math.sqrt(no); i += 2) {
            if (no % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(no + " is a prime");
        } else {
            System.out.println(no + " is not a prime");
        }
    }

    public static void main(String[] args) {

        int no = 8;
        checkPrime(no);

    }
}
