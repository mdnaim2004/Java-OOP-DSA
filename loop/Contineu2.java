import java.net.Socket;
import java.util.Scanner;

public class Contineu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter your number:");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }

        }while(true);
    }
}
