class Binary_To{


    public static void oddEven(int n){
        int BitMask = 1;
        if((n & BitMask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

                                                                                                                                                                                           
    public static void main(String args[]){
        System.out.println("Binary AND =" +(5 & 6));

        System.out.println("Binary OR =" +(5 | 6));

        System.out.println("Binary XOR =" +(5 ^ 6));

        System.out.println("Binary One's compliment =" +( ~ 0));
        
        System.out.println("Binary left shist =" +(5 << 2));

        System.out.println("Binary Right shift =" +(5 >> 2));

        oddEven(7);
    }
}