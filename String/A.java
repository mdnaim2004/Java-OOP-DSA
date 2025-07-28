 import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int[] notes = {100, 50, 20, 10, 5, 2, 1};

       
        for (int note : notes) {
            int count = amount / note;
            amount %= note;
            System.out.println(count + " nota(s) de R$ " + note + ",00");
        }
    }
}
