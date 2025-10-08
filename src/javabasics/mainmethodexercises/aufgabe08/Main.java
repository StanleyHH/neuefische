package javabasics.mainmethodexercises.aufgabe08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie heißt du?");
        String name = scanner.nextLine();
        System.out.println("Hallo " + name);
    }
}
