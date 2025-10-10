public class Medium {
    public static void main(String[] args) {
        divide(4, 0);
        System.out.println(divide(4, 0));
    }

    public static Character getFirstLetter(String text) {
        return text == null ? null : text.charAt(0);
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by 0");
        }

        return (double) a / b;
    }
}
