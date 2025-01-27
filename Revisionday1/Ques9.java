package Revisionday1;

// Binary Search

public class Ques9 {

    private static int binarySearch(int arr[], int search) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] == search)
                return mid;

            if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };

        int search = 60;

        int pos = binarySearch(arr, search);

        if (pos != -1) {
            System.out.println(search + " is found at" + pos);
        } else {
            System.out.println(search + " is not found");
        }
    }
}
