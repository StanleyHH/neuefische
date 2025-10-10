package ifelseexercise.medium;

public class Main {
    public static void main(String[] args) {
        int score = 55;
        boolean hasTicket = true;
        int temperature = 23;
        int number = 34;

        if (score >= 50 && hasTicket) {
            System.out.println("Eintritt erlaubt.");
        } else {
            System.out.println("Eintritt verboten.");
        }

        if (temperature >= 30) {
            System.out.println("Heiß");
        } else if (temperature >= 20) {
            System.out.println("Warm");
        } else if (temperature >= 10) {
            System.out.println("Kühl");
        } else {
            System.out.println("Kalt");
        }

        String parity = number % 2 == 0 ? "Gerade" : "Ungerade";
    }
}
