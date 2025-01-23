package day7;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    private static void removeDuplicate(int arr[]){

        Set<Integer> unique = new LinkedHashSet<>();

        for(int x : arr){
            unique.add(x);
        }

        int newArr[] = new int[unique.size()];

        int index = 0;
        for(int num : unique){
            newArr[index++] = num;
        }

        for(int y : newArr){
            System.out.print(y + " ");
        }

    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,2,4,5,4,5,6};

        removeDuplicate(arr);

    }
}
