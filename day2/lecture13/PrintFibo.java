import java.util.Scanner;

public class PrintFibo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n!");
        int n = sc.nextInt();

        

        System.out.println("Printing Fibo till " + n + "th position");
        
        fibo(n);
        

        sc.close();

    }

    private static void fibo(int n){
        int first = 0;
        int second = 1;

        if(n >= 1)
            System.out.print(first + " ");
        if(n >=2)
            System.out.print(second + " ");

        for(int i=0;i<n;i++){
            int third = first + second ;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }

}