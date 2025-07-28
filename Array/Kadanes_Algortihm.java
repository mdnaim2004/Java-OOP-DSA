public class Kadanes_Algortihm {
    
    public static int kadanes_algorithm(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<nums.length; i++){
            cs = cs+nums[i];

            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
            
        }

        System.out.println("maximum sum is: " + ms);
        return cs;

    }


    public static void main(String[] args) {
        int nums[] = {-2, -3, 4, -1, 5, -3};
        kadanes_algorithm(nums);
    }
}
