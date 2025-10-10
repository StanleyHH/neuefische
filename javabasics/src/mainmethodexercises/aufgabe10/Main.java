package mainmethodexercises.aufgabe10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie heißt du? ");
        String name = scanner.nextLine();

        System.out.print("Wie alt bist du? ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Was ist dein Lieblingsspruch? ");
        String favoriteQuote = scanner.nextLine();

        System.out.print("Gib die erste Zahl ein: ");
        int zahl1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Gib die zweite Zahl ein: ");
        int zahl2 = Integer.parseInt(scanner.nextLine());
        System.out.println();

        System.out.println("Dein Name ist " + name + " und du bist " + age + " Jahre alt!");
        System.out.println("Dein Lieblingsspruch ist: " + favoriteQuote);

        System.out.println(zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));
    }
}
