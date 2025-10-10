package javabasics.arrayexercise.bonus.aufgabe03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Gib 5 Zahlen ein");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Du hast folgende Zahlen eingegeben: ");
        for (int num : nums) {
            System.out.print(" " + num);
        }
    }
}
