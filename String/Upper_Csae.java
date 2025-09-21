public class Upper_Csae {

    public static String toUppercaase(String str){

        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i) == ' ') && (i<str.length()-1)){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return toUppercaase(str);
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(toUppercaase(str));
    }
}
