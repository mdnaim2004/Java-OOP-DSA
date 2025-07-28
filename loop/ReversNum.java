public class ReversNum {
    public static void main(String[] args) {
        int n = 234968574;

        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit+" ");
            n = n / 10;
        }
        System.out.println();
    }
}
