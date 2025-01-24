package day8;

public class ReverseString{

    private static void reverseString(char str[]){
        int left = 0;
        int right = str.length-1;

        while(left < right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reverse of a String : " + new String(str));
    }

    public static void main(String[] args) {
        
        String str = "hello";
        System.out.println("Before Reverse: " + str);
        reverseString(str.toCharArray());

    }

}