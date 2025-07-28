public class CharAt {

    public static void print_Latter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) +" ");
        }
    }
    public static void main(String[] args) {
        String frist_name = "Md Naim ";
        String last_name = "Babu";

        String Full_name = frist_name +" "+last_name;

       

        // String str;
        print_Latter(Full_name);
    }
}
