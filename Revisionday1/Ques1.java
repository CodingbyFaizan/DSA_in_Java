package Revisionday1;


// Step 1 reverse
// step 2 reverse first kth element
// step 3 reverse n-k element

public class Ques1 {

    private static void reverseArray(int arr[],int left,int right){

        // int left = 0;
        // int right = arr.length-1;

        System.out.println("What element get for sorting");
        for(int i=left;i<=right;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("-----------------------------");

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    private static void rotateRightByK(int arr[],int k){
        int n = arr.length;
        k = k % n;

        
        System.out.println("------------------------------");
        reverseArray(arr,0,n-1);
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        System.out.println();
        
        System.out.println("------------------------------");
        reverseArray(arr, 0, k-1);
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        System.out.println();

        System.out.println("------------------------------");
        reverseArray(arr, k, n-1);

        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("------------------------------");


    }
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 2;

        rotateRightByK(arr,k);

    }
}
