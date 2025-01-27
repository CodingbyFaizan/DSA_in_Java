package revisionday2;
import java.util.LinkedHashSet;
import java.util.Set;

// Remove duplicate

public class Ques24 {
    private static void remove(int arr[]) {
        Set<Integer> nums = new LinkedHashSet<>();

        for(int x : arr){
            nums.add(x);
        }

        System.out.println(nums);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 4, 3, 4 };
        remove(arr);

    }
}
