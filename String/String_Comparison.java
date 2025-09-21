public class String_Comparison {
    public static String compressed(String str) {
        String newStr = ""; // Initialize as empty string instead of space
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            // Use a separate variable to check consecutive characters
            int j = i;
            while (j < str.length() - 1 && str.charAt(j) == str.charAt(j + 1)) {
                count++;
                j++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count;
            }
            // Skip the consecutive characters we've already counted
            i = j;
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaaaabbbbbbbbbbbcdddeeeeefddddhhhhggggg";
        System.out.println(compressed(str));
    }
}