public class PairsNum {

     
    public static int pairsNum(int nums[]){

        int tp = 0;

        for(int i=0; i<nums.length; i++){
            int current = nums[i];

            for(int j=i+1; j<nums.length; j++){
                System.out.print(" ("+current+" ,"+nums[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+tp);
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        pairsNum(nums);
    }
}
