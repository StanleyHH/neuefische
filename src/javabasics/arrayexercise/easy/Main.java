package javabasics.arrayexercise.easy;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 24, 35, 4, 5};
        String[] names = {"Stanislav", "Max", "John"};
        int[] nums2 = {2, 4, 6, 8};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i] * nums2[i]);
        }
    }
}
