package Revisionday1;

import java.util.HashMap;

// Find occurrence of digit in a number 

public class Ques17 {
    private static void countDigit(int arr[]){
        HashMap<Integer,Integer> countOccur = new HashMap<>();

        for(int x : arr){
            if(countOccur.containsKey(x)){
                int count = countOccur.get(x);
                countOccur.put(x, count+1);
            }else{
                countOccur.put(x, 1);
            }
        }

        for(int key : countOccur.keySet()){
            System.out.println(key + " occurs " + countOccur.get(key) + " times");
        }

    }
    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 5, 6, 6 };
        countDigit(arr);

    }
}
