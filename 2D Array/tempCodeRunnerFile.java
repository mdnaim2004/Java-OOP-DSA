public class Insertion_sort {


    public static int insertionsort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            int curr = nums[i];
            int prev = i-1;

            while(prev >=0 && nums[prev] > nums[curr]){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = nums[curr];
        }
        return 0;
    }

    public static void print_arr(int nums[]) {
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {10,9,5,6,2,1,3,7,8,4};

        insertionsort(nums);

        print_arr(nums);
    }
}
