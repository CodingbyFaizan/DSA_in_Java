package revisionday2;

import java.util.Arrays;

public class Ques22 {

    private static void findMissing(int arr[]) {
        Arrays.sort(arr);
        int n = arr[arr.length-1];
        int expectedSum = ( n * (n + 1) )/ 2; 
        
        int sum = 0 ;   
        for(int x : arr){
            sum += x;
        }

        if(expectedSum != sum){
            System.out.println("Missing Number is " + (expectedSum - sum));
        }else{
            System.out.println("There is no missing number");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 6 };
        findMissing(arr);

    }
}
