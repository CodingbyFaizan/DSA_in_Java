package day7;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingMultiple {

    private static void missingNumber(int arr[]) {

        Arrays.sort(arr);
        ArrayList<Integer> missing = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {

            int current = arr[i];
            int nextExpected = current + 1;

            while (nextExpected < arr[i + 1]) {
                missing.add(nextExpected);
                nextExpected++;
            }

        }

        System.out.println("Missing Numbers : " + missing);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 6, 7 };

        missingNumber(arr);

    }
}
