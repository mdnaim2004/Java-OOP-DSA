public class LinearS {

    public static int linearSearch(int num[], int target){
        for(int i=0; i<num.length; i++){
            if(num[i] == target){
                return i;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16};
        
        int target = 5;

        int index = linearSearch(num, target);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("the index is="+index);
        }
     }
}
