package arrayexercise.bonus.aufgabe02;

public class Main {
    public static void main(String[] args) {
        String[] firstNames = {"Otto", "Kevin", "John", "Jane", "Bob"};
        String[] lastNames = {"Bauer", "Smith", "Dow", "Becker"};

        for (int i = 0; i < firstNames.length && i < lastNames.length; i++) {
            System.out.println(firstNames[i] + " " + lastNames[i]);
        }
    }
}
