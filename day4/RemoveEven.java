package day4;

import java.util.Scanner;

public class RemoveEven{

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("Counting Odds Number from an array");
        for(int x : arr){
            if(x % 2 != 0){
                count++;
            }
        }

        if(count == 0)
        {
            System.out.println("There is no odds number in the array");
        }else{
            System.out.println("Count : " + count);
        }

        int new_arr[] = new int[count];

        // int i = 0;
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                new_arr[idx] = arr[i];
                idx++;
            }
        }

        System.out.println("New Array");
        for(int z : new_arr){
            System.out.print(z + " ");
        }

        sc.close();
    }

}