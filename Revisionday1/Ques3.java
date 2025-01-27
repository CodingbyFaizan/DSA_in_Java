package Revisionday1;

public class Ques3 {

    private static void secondLargest(int arr[]){

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] > second && arr[i] < first){
                second = arr[i];
            }
        }

        if(second != Integer.MIN_VALUE){
            System.out.println("Second : " + second);
        }else{
            System.out.println(-1);
        }

    }
    public static void main(String[] args) {
        
        int arr[] = {10,20,5,45,90};
        secondLargest(arr);

    }
}
