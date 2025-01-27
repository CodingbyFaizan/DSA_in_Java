package revisionday2;

import java.util.Arrays;
import java.util.HashMap;

public class Ques25 {

    private static void nonRepeating(int arr[]) {

        // Arrays.sort(arr);
        HashMap<Integer,Integer> nonRepeating = new HashMap<>();


        for (int x : arr) {

            if (nonRepeating.containsKey(x)) {
                int count = nonRepeating.get(x);
                nonRepeating.put(x, count +1);
            }else{
                nonRepeating.put(x, 1);
            }

        }

        for(int z : nonRepeating.keySet()){
            if(nonRepeating.get(z) == 1){
                System.out.println(z);
                break;
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5 };

        nonRepeating(arr);

    }
}
