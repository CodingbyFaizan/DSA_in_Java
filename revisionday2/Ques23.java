package revisionday2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ques23 {

    private static void missingMultiple(int arr[]) {

        List<Integer> missing = new ArrayList<>();

        Arrays.sort(arr);
        // int expectedNext = arr[0]+1;
        
        for(int i=0;i<arr.length-1;i++){
            int current = arr[i];
            int nextExpected = current + 1;

            while(nextExpected < arr[i+1]  ){
                missing.add(nextExpected);
                nextExpected++;
            }
        }

        System.out.println(missing);
        

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 6, 7 };
        missingMultiple(arr);

    }
}
