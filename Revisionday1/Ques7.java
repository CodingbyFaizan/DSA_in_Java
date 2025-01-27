package Revisionday1;

public class Ques7 {
    // private static void printDigit(){

    // }
    public static void main(String[] args) {
        
        int no = 1234;
        int count = 0;

        while(no != 0 ){
            no = no /10;
            count++;
        }

        System.out.println("Digits count : " + count);

    }
}
