import java.util.Arrays;

class Inbuiltsort {

    public static void print_arr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 5, 6, 2, 1, 3, 7, 8, 4};

        Arrays.sort(nums);
        Arrays.sort(nums, 0,9);     

        print_arr(nums);      
    }
}
