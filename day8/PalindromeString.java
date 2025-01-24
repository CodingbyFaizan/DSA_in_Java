package day8;

public class PalindromeString {

    private static void palindromeChecker(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char str[] = s.toCharArray();

        int start = 0;
        int end = str.length - 1;
        boolean result = true;

        while (start < end) {
            if (str[start] != str[end]) {
                result = false;
                break;
            }
            start++;
            end--;
        }

        if (result) {
            System.out.println(new String(str) + " is a palindrome");
        } else {
            System.out.println(new String(str) + " is not palindrome");
        }

    }

    public static void main(String[] args) {

        String str = "apple";

        palindromeChecker(str);

    }
}
