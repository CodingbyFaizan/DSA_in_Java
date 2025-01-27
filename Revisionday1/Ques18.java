package Revisionday1;

// move zeros 

public class Ques18 {
    private static void moveZeros(int[] arr) {

        // int nonRepeatingCount = 0;
        // int newArray[] = new int[arr.length];
        // int idx = 0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] != 0){
        //         newArray[idx] = arr[i];
        //         nonRepeatingCount++;
        //         idx++;
        //     }
        // }

        // // int size = arr.length - nonRepeatingCount;

        // for(int i=nonRepeatingCount; i<newArray.length; i++){
        //     arr[i] = 0;
        // }

        int nonRepeatingIndex = 0;
        for(int x : arr){
            if(x != 0 ){
                arr[nonRepeatingIndex] = x;
                nonRepeatingIndex++;
            }
        }

        while(nonRepeatingIndex < arr.length){
            arr[nonRepeatingIndex] = 0;
            nonRepeatingIndex++;
        }

        for(int x : arr){
            System.out.print(x + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 0, 3, 4 };

        moveZeros(arr);
            }
        
}
