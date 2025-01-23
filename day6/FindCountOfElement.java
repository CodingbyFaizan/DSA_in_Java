package day6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Occurrence can be found using 2 ways -->
// Using Sorted array
// using hashmap

// first find if that element already present if it is 
// get the latest count of the element i.e its value
// increment by 1 and put that same element back 
// map will update the key with latest value as it doesnt 
// support duplicate keys 


public class FindCountOfElement {

    /*---------------------------------------------------- */
    // SOLUTION 1
    private static void findCountOfElementUsingArray(int arr[]) {

        Arrays.sort(arr);
        int count = 1;                                                                                     
        for(int i=1; i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                System.out.println(arr[i-1] + " occurs " + count + " times");
                count = 1;
            }
        }

        System.out.println(arr[arr.length-1] + " occurs " + count + " times");

    }

    /*---------------------------------------------------- */


    
    // SOLUTION 2

    /*---------------------------------------------------- */
    // private static void findCountOfElement(int arr[]) {

    //     Map<Integer, Integer> frequency = new HashMap<>();

    //     for (int x : arr) {
    //         if (frequency.containsKey(x)) {
    //             int count = frequency.get(x);
    //             frequency.put(x, count + 1);
    //         } else {
    //             frequency.put(x, 1);
    //         }
    //     }

    //     for (int key : frequency.keySet()) {
    //         System.out.println(key + " occures --> " + frequency.get(key) + " times");
    //     }
    // }
    /*---------------------------------------------------- */



    public static void main(String[] args) {

        int arr[] = { 1, 2, 1, 3, 2, 3, 4, 6, 3, 4 };

        findCountOfElementUsingArray(arr);

    }
}
