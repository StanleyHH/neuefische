public class Medium {
    public static void main(String[] args) {

    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static boolean isPalindrome(String text) {
        return text.equalsIgnoreCase(reverseString(text));
    }
}
