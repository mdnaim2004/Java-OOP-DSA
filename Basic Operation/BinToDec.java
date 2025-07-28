public class BinToDec {
    public static void binToDecz(int binNum){
        int pow = 0;
        int decNum = 0;
        int originalBin = binNum;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Binary " + originalBin + " to Decimal = " + decNum);
    }
     public static void decToBin(int n){
            int myNum = n;
            int pow = 0;
            int binNum = 0;

            while(n > 0){
                int rem = n % 2;
                binNum = binNum + (int)(Math.pow(10, pow));

                pow++;
                n = n/2;
            }
            System.out.println("binary fronm of "+ myNum + "="+binNum);
        }
        
        
    public static void main(String[] args) {
        binToDecz(1010110101);  
        decToBin(54);

       
    }
}
 