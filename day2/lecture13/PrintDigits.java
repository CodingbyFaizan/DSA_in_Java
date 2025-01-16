import java.util.Scanner;

public class PrintDigits {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;
        while(n != 0){
            n = n/10;
            count++;
        }

        // Printing

        int div = (int) Math.pow(10,count-1);

        while( div != 0 ){
            System.out.println(temp/div);
            temp = temp % div;
            div = div / 10;
        }

        sc.close();

    }

}
