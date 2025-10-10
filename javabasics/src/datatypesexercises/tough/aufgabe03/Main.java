package datatypesexercises.tough.aufgabe03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isVocal = false;

        System.out.print("Gib ein Zeichen ein: ");
        char letter = scanner.nextLine().charAt(0);

        isVocal = letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';

        if (isVocal) {
            System.out.println("Vokal");
        } else {
            System.out.println("Kein Vokal");
        }
    }
}
