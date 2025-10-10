package ifelseexercise.bonus.aufgabe01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gid dein Name ein: ");
        String name = scanner.nextLine();

        if (name == null || name.isBlank()) {
            System.out.println("Ungültiger Name");
        } else {
            System.out.println("Hallo, " + name.strip());
        }
    }
}
