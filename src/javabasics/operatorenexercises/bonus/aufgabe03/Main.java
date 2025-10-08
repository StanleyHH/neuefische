package javabasics.operatorenexercises.bonus.aufgabe03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie alt bist du? ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Bist du Mitglied (true/false)? ");
        boolean isMember = Boolean.parseBoolean(scanner.nextLine());

        if (age >= 18 && isMember) {
            System.out.println("Zugang erlaubt.");
        } else {
            System.out.println("Zugang nicht erlaubt.");
        }
    }
}
