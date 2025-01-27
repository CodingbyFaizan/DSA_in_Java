package Revisionday1;

// Reverse a string 

public class Ques2 {

    private static void reverseString(String st){
        String str = st.replaceAll("[^a-zA-Z0-9]" ,"").toLowerCase();

        char s[] = str.toCharArray();

        int start = 0;
        int end = s.length-1;

        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        System.out.println(new String(s));
    }
    public static void main(String[] args) {
        
        String str = "Hello World";

        reverseString(str);

    }
}
