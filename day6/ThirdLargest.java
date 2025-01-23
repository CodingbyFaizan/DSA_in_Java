package day6;

public class ThirdLargest {

    private static int thirdlargest(int arr[]){

        if(arr.length < 3)
            return -1;

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
            }else if(x > third && x < second){  

            }
        }

        return third == Integer.MIN_VALUE ? -1 : third;

    }
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40};
        // first --> 40
        // second --> 30
        // third --> 20

        System.out.println(thirdlargest(arr));

    }
}
