package day7;


// Find the Missing Number in a Consecutive Sequence

public class FindMissing {
    private static void missingNumber(int arr[], int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int x : arr) {

            actualSum += x;

        }
        System.out.println("Actual sum " + actualSum);
        System.out.println("Expected sum " + expectedSum);

        System.out.println("Missing Number : " + (expectedSum - actualSum));
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 5, 6 };
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i] ){
                max = arr[i];
            }
        }

        int n = max;

        missingNumber(arr, n);

    }
}
