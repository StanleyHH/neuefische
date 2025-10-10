public class Bonus {
    public static void main(String[] args) {

    }

    public static boolean isPrime(int num) {
        if (num == 2 || num == 3 || num == 5 || num == 7) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
