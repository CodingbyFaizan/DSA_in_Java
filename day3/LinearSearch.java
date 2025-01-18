package day3;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:");
        int size = sc.nextInt();                                  // 1
        int arr[] = new int[size];                                // n

        /* ----------------------------------------------- */
        System.out.println("Enter value into an array:");
        for (int i = 0; i < arr.length; i++) {                    // 1
            arr[i] = sc.nextInt();
        }
        /* ----------------------------------------------- */

        /* ----------------------------------------------- */
        System.out.println("Array Values:");
        for (int x : arr)                                          // 1
            System.out.print(x + " ");
        /* ----------------------------------------------- */

        System.out.println();
        System.out.println("Enter value you want to search");
        int searchKey = sc.nextInt();                              // 1

        int pos = linearSearch(arr, searchKey);                    // 1

        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element " + searchKey + " is found at " + (pos + 1) + " position");
        }
        sc.close();
    }

    private static int linearSearch(int arr[], int searchKey) {     // n + 1

        if (arr.length == 0) {
            System.out.println("Empty Array!");
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {                      // 1
            if (arr[i] == searchKey) {
                return i;
            }
        }
        return -1;
    }
}

// Time complexity 
// O(n) ---> worst case
// O(1) ---> Best case

// Space complexity
// 7 + 2 n ---> O(n)

