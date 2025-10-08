package javabasics.datatypesexercises.tough.aufgabe01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie heißt du? ");
        String name = scanner.nextLine();

        System.out.print("Wie alt bist du? ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Was ist dein Lieblingsbuchstabe? ");
        char letter = scanner.nextLine().charAt(0);

        System.out.println("Hallo " + name + ", dein Lieblingsbuchstabe ist " + letter + " und du bist " + age + " Jahre alt.");
    }
}
