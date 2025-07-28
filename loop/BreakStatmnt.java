import java.util.PrimitiveIterator;

public class BreakStatmnt {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            if( i == 7){
                break;
            }
            System.out.println(i);
        }
        System.out.println("i m out of  the loop");
    }
}
