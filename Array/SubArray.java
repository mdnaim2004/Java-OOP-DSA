public class SubArray {

    public static int subarray(int nums[]){

        int ts = 0; 

        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i+1; j<nums.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){    //print
                    System.out.print(nums[k]+" ");   //subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray = "+ts);

        return 0;
    }


    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        subarray(nums);
    }
}
