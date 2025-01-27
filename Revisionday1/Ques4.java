package Revisionday1;

import java.util.HashMap;
// Count occurence of element in an array

public class Ques4 {
    private static void findOccurence(int arr[]) {

        HashMap<Integer,Integer> countOccur = new HashMap<>();
        int count = 1;
        for(int x : arr){
            if(countOccur.containsKey(x)){
                count = countOccur.get(x);
                countOccur.put(x,count+1);
            }else{
                countOccur.put(x, 1);
                count = 1;
            }
        }

        for(int key : countOccur.keySet()){
            System.out.println(key + " occurs " + countOccur.get(key) + " times" );
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 1, 2, 2, 4, 5 };
        findOccurence(arr);

    }
}
