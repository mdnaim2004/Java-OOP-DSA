import java.util.Arrays;
import java.util.Collections;

class Inbuilt_Sort {

    public static void print_arr(Integer nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] nums = {10, 9, 5, 6, 2, 1, 3, 7, 8, 4};

        Arrays.sort(nums,Collections.reverseOrder());   
        Arrays.sort(nums, 0, 8,Collections.reverseOrder());   


        print_arr(nums);       
    }
}
