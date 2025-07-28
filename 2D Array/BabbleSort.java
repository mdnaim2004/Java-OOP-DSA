class BabbleSort{

    public static void babbleSort(int arr[]) {
        for(int turns=0; turns<arr.length; turns++){
            for(int j=0; j<arr.length-1-turns; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void print_arr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};

        System.out.print("Before sort: ");           // 1️⃣5️⃣ sort‑এর আগে
        print_arr(arr);                              // 1️⃣6️⃣ বর্তমান অবস্থা দেখাও

        babbleSort(arr);                             // 1️⃣7️⃣ Bubble Sort কল, ইন‑প্লেসে সাজাবে

        System.out.print("After  sort: ");           // 1️⃣8️⃣ sort‑এর পরে
        print_arr(arr);   
        
    }
}