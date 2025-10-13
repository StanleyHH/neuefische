public class Medium {
    public static void main(String[] args) {

    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static boolean isPalindrome(String text) {
        return text.equalsIgnoreCase(reverseString(text));
    }

    public static int countVowels(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }

        return count;
    }
}
