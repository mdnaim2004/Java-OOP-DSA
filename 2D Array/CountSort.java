public class CountSort {

    public static int countsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        return 0;  // actually return করার দরকার নেই, কারণ কাজটা void দিয়েও হয়ে যায়।
    }

    public static void print_arr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10, 11, 3, 4, 5, 5, 8, 8, 8, 2, 15};

        System.out.print("Before Sorting: ");
        print_arr(arr);

        countsort(arr);

        System.out.print("After Sorting: ");
        print_arr(arr);
    }
}
