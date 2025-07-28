public class ReverseNum {

    public static void reverseNUm(int nums[]) {
        int first = 0;
        int last = nums.length - 1;

        while (first < last) {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12, 14, 16};

        reverseNUm(nums); 

        for (int i=0;i<nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
}
