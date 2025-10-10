package javabasics.arrayexercise.medium.aufgabe02;

public class Main {
    public static void main(String[] args) {
        int[] nums = {34, 55, 22, 1, 34, 66};
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        System.out.println(sum);
    }
}
