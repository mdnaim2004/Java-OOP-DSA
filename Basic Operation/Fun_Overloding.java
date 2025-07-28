public class Fun_Overloding {
    public  static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public  static float sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(1,5,9 ));

        System.out.println(sum(4.5f, 9.8f));
    }
}
