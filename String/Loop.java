import java.util.Scanner;

public class Loop {
    // public static void main(String[] args) {
    //     for(int i=0; i<=25; i++){
    //         System.out.println("Meena is participating in YCPC 2025");
    //     }
    // }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        String number = sc.next();

       
        int digitX = number.charAt(X - 1) - '0';
        int digitY = number.charAt(Y - 1) - '0';

       
        if (digitX == 0 || digitY == 0) {
            System.out.println("NO");
        } else if (digitX % digitY == 0 || digitY % digitX == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
