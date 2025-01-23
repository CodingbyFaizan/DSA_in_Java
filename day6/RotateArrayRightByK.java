package day6;

public class RotateArrayRightByK {

    private static void reverseArray(int arr[], int start, int end){

        int temp = 0;

        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        
    }

    private static void rotateRight(int arr[],int k) {

        int n = arr.length;
        k = k % n;

        reverseArray(arr,0,n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        int k = 2;

        System.out.println("Before rotating array ");

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("After rotating array by " + k);

        rotateRight(arr, k);

        // for (int x : rotateRight(arr,k)) {
        //     System.out.print(x + " ");
        // }

    }

}
