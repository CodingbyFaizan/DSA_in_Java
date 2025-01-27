package Revisionday1;

// Binary Search

public class Ques10 {

    private static int linearSearch(int arr[], int search) {

        for(int i=0;i<arr.length;i++){
            if(arr[i] == search){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };

        int search = 20;

        int pos = linearSearch(arr, search);

        if (pos != -1) {
            System.out.println(search + " is found at " + (pos+1));
        } else {
            System.out.println(search + " is not found");
        }
    }
}
