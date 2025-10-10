package arrayexercise.bonus.aufgabe05;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = random.ints(10, 1, 101).toArray();
        int sum = 0;

        for (int num : nums) {
            sum += num;
            System.out.print(num + " ");
        }

        System.out.println();
        Arrays.sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Minimum: " + nums[0]);
        System.out.println("Maximum: " + nums[nums.length -1]);
        System.out.println("Durchschnitt: " + (double) sum / nums.length);
    }
}
