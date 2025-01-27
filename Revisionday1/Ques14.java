package Revisionday1;

public class Ques14 {
    private static void largestElement(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Largest Element : " + max);
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 4, 40 };
        largestElement(arr);

    }
}
