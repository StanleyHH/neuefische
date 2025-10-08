package java_basics.main_method_exercises.aufgabe8;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie heißt du?");
        String name = scanner.nextLine();
        System.out.println("Hallo " + name);
    }
}
