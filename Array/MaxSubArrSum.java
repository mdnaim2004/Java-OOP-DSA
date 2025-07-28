public class MaxSubArrSum {

    public static int maxSubArrSum(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i; j<nums.length; j++){
                int end = j;
                currSum = 0;

                for(int k=start; k<=end; k++){
                    currSum +=nums[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
        return 0;

    }


    public static void main(String[] args) {
        int nums[] = {1, -2, 6, -1, 3};
        maxSubArrSum(nums);
    }
}
