package day5;

// Second Largest in an array 
// If less than two distinct value (unique value) return -1

public class SecondLargest {
    private static int secondLargest(int arr[]){

        if(arr.length < 2)
            return -1;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int x : arr){
            if(x > first){
                // shifting first value to value 
                // assigning largest to the first

                second = first;
                first = x;
            }else if(x > second){
                second = x;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        
        int arr[] = { 10,5,20,2,66};

        System.out.println("Second largest is " + secondLargest(arr));

        // for(int x : secondLargest(arr)){
        //     System.out.print();
        // }

    }
}
