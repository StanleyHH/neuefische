package ifelseexercise.easy;

public class Main {
    public static void main(String[] args) {
        int age = 44;
        boolean isRaining = true;
        String city = "Berlin";

        if (age >= 18) {
            System.out.println("Volljärig");
        }

        if (isRaining) {
            System.out.println("Nimm einen Regenschirm");
        } else {
            System.out.println("Kein Regenschirm nötig");
        }

        if (city.equals("Berlin")) {
            System.out.println("Hauptstadt");
        }
    }
}
