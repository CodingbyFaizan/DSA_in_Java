package Revisionday1;

public class Ques11 {
    public static void main(String[] args) {
        
        int n = 1234;
        int count = 0;
        int temp = n;

        while(n > 0){
            n = n/10;
            count++;
        }

        System.out.println(count);

        int div = (int) Math.pow(10, count-1);
        System.out.println(div);

        while(div != 0){
            System.out.println((temp / div) + " ");
            
            temp = temp % div;
            div = div/10;

        }



    }
}
