package day6;

public class MoveZeros {

    private static void moveZeros(int arr[]) {
        int nonZerosIndex = 0;

        for(int x : arr) {

            if (x != 0) {
                arr[nonZerosIndex] = x;
                nonZerosIndex++;
            }

        }

        while(nonZerosIndex < arr.length) {
            arr[nonZerosIndex] = 0;
            nonZerosIndex++;
        }

        for(int z : arr) {
            System.out.print(z + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 0, 30, 0, 50 };

        System.out.println("Before array ");

        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("After moving zeros to end in an array ");

        moveZeros(arr);
        // for (int x : moveZeros(arr)) {
        // System.out.print(x + " ");
        // }

    }

}
