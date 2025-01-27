package revisionday2;

public class Ques26 {

    private static boolean palindromeChecker(String s){

        String string = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        System.out.println(string);
        char str[] = string.toCharArray();
        int start = 0;
        int end = str.length-1;
        // boolean flag = true;

        
        
        while(start < end){
            if(str[start] != str[end])
                return false;
            start++;
            end--;
        }

        // if(flag){
        //     return true;
        // }
        
        return true;

    }
    public static void main(String[] args) {
        
        String s = "hello, my name is faizan";
        System.out.println(palindromeChecker(s));

    }
}
