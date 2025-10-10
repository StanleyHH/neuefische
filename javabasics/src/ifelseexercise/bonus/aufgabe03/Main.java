package ifelseexercise.bonus.aufgabe03;

public class Main {
    public static void main(String[] args) {
        register("Stanislav", 13);
    }

    public static void register(String username, int age) {
        if (username == null ||username.isBlank()) {
            return;
        }

        if (age < 18) {
            return;
        }

        System.out.println("Registrierung erfolgreich.");
    }
}
