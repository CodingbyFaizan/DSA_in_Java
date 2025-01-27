package Revisionday1;

public class Ques16 {

    private static int secondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x < first) {
                second = x;
            }
        }

        return second == Integer.MIN_VALUE ? -1 : second;

    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 3, 9 };

        System.out.println(secondLargest(arr));

    }

}
