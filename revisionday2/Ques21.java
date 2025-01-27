package revisionday2;

public class Ques21 {
    private static void thirdLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

         for(int x : arr){
            if(x > first){
                third = second;
                second = first;
                first = x;
            }else if(x > second && x < first){
                second = x;
            }else if(x > third && x <second){
                third = x;
            }
         }

         System.out.println("THIRD LARGEST : " + third);


    }
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        thirdLargest(arr);

    }

}
