package day6;

public class RotateArray {

    private static int[] rotateArray(int arr[]) {

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        return arr;

    }

    public static void main(String args[]) {

        int arr[] = { 10, 20, 30, 40, 50 };

        System.out.println("Before rotating array ");

        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println("After rotating array ");

        for (int x : rotateArray(arr)) {
            System.out.print(x + " ");
        }

    }

}