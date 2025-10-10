package arrayexercise.bonus.aufgabe01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {34, 2, 23, 66, 1, 5};

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
        }

        System.out.print(Arrays.toString(nums));
    }
}
