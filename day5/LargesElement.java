package day5;

public class LargesElement {

    private static int findLargestElement(int arr[]) {
        int largeElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largeElement) {
                largeElement = arr[i];
            }
        }
        return largeElement;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 3, 9 };

        System.out.println("Largest Element is " + findLargestElement(arr));

    }
}

// Time ----> O(n)
// Space ----> O(1) for algorithm
