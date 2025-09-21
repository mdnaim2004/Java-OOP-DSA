public class SubString {

    public static String subString(String str, int si, int ei){
        String sbuString = "";
        for(int i=si; i<ei; i++){
            sbuString += str.charAt(i);
        }
        return sbuString;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println(str.substring(4, 9));
    }
}
