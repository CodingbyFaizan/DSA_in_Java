package day3;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:");
        int size = sc.nextInt(); // 1
        int arr[] = new int[size]; // n

        /* ----------------------------------------------- */
        System.out.println("Enter value into an array int sorted form:");
        for (int i = 0; i < arr.length; i++) { // 1
            arr[i] = sc.nextInt();
        }
        /* ----------------------------------------------- */

        /* ----------------------------------------------- */
        System.out.println("Array Values:");
        for (int x : arr) // 1
            System.out.print(x + " ");
        /* ----------------------------------------------- */

        System.out.println();
        System.out.println("Enter value you want to search");
        int searchKey = sc.nextInt();

        int pos = binarySearch(arr, searchKey);

        if (pos == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element " + searchKey + " is found at " + (pos + 1) + " position");
        }

        sc.close();

    }

    private static int binarySearch(int arr[], int searchKey) {
        if (arr.length == 0) {
            System.out.println("Empty Array");
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == searchKey) {
                return mid;
            }
            if (searchKey > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }
}
