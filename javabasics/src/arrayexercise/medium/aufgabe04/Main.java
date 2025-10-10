package arrayexercise.medium.aufgabe04;

public class Main {
    public static void main(String[] args) {
        int[] nums = {34, 55, 2, 11, 65, 7};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("min: " + min + ", max: " + max);
    }
}
