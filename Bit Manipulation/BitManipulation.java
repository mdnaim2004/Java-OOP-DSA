public class BitManipulation {

    
    public static void oddEven(int n){
    

        int bitMask = 1;
        if((n & bitMask) != 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;   
        if ((n & bitMask) == 0) {
            return 0;   
        } else {
            return 1;   
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int cleanBit(int n, int i){
        int bitMask =~(1<<i);
        return n & bitMask;
    }
    public static int updathIthBit(int n, int i, int newbit){
        int n = clearIntBit(int )
    }
    public static void main(String args[]){
        //System.out.println((5&6));
        //System.out.println((5|6));
        //System.out.println(5^6);
        //System.out.println(~5);
        //System.out.println(~0);
        //System.out.println(5<<2);
        //System.out.println(6>>1);
        //System.out.println((2>>2));

        //oddEven(1012);

        //System.out.println(getIthBit(10,2));
        //System.out.println(setIthBit(10,3));
        //System.out.println(cleanBit(10,3));
    }
}