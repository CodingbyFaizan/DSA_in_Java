package Revisionday1;

public class Ques15 {

    private static void reverseArray(int arr[]){

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int x : arr){
            System.out.print(x + " ");
        }

    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};

        reverseArray(arr);

    }
}
