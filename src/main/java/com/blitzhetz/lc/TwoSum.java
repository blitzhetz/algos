package com.blitzhetz.lc;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // case 1
        // int[] nums = { 2, 7, 11, 15 };
        // int target = 9;

        // case 2
        // int[] nums = { 3, 2, 4 };
        // int target = 6;

        // case 3
        int[] nums = { 3, 3 };
        int target = 6;

        int[] result = twoSum(nums, target);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println();
    }
}
