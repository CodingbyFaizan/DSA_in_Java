package day8;

import java.util.Arrays;
import java.util.HashMap;

// Find First non repeating character

public class FirstNonRepeating {

    private static void nonRepeating(char[] str) {

        HashMap<Character, Integer> nonRepatingMap = new HashMap<>();

        for (int i = 0; i < str.length - 1; i++) {
            if (nonRepatingMap.containsKey(str[i])) {
                int count = nonRepatingMap.get(str[i]);
                nonRepatingMap.put(str[i], count + 1);

            } else {
                nonRepatingMap.put(str[i], 1);
            }
        }

        for (char key : nonRepatingMap.keySet()) {
            if (nonRepatingMap.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }

    }

    public static void main(String[] args) {

        String str = "aabcdd";
        nonRepeating(str.toCharArray());

    }
}
