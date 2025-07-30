import java.util.Scanner;

public class Pallendrom_Char {

    public static boolean isPallindrom(String name){
        int n = name.length();
        for(int i = 0; i < n / 2; i++){
            if(name.charAt(i) != name.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String name = sc.nextLine();

        if(isPallindrom(name)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
