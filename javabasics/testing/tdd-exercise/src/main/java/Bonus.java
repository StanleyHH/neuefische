public class Bonus {
    public static void main(String[] args) {

    }

    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return  result;
    }

    public static int fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        for (int i = 0; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return n1;
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            if (i < a.length) {
                result[i] = a[i];
            } else {
                result[i] = b[i - a.length];
            }
        }

        return result;
    }
}
