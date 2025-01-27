package Revisionday1;

// Remove even

public class Ques12 {

    private static void removeEven(int arr[]) {
        // int oddArr[] = 

        int count = 0;
        for(int x : arr){
            if(x % 2 != 0)
                count++;
        }

        if(count == 0)
            System.out.println("There is no odd elements");

        int oddArr[] = new int[count];

        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0 ){
                oddArr[idx] = arr[i];
                idx++;
            }
        }

        for(int z : oddArr){
            System.out.print(z + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        removeEven(arr);}
}
