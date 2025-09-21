public class Stirng_Builder {
    /**
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        for(int ch = 'a'; ch<= 'z'; ch++){
            sb.append(null);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
