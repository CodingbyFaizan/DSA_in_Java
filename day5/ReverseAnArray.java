package day5;

// Reverse an array
// Time ---> O(n)
// Space ---> O(1)

public class ReverseAnArray {

    private static int[] reverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        int temp = 0;

        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[] = { 11, 22, 34, 34, 55 };

        for (int x : reverseArray(arr)) {
            System.out.print(x + " ");
        }

    }
}
