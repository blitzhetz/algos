package com.blitzhetz.lc;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // int size = nums.length;

        // Solution 1
        // O(n^2)
        // for (int i = 0; i < size - 1; i++) {
        // for (int j = i + 1; j < size; j++) {
        // if (nums[i] == nums[j]) {
        // return true;
        // }
        // }
        // }

        // Solution 2
        // Arrays.sort(nums);
        // for (int i = 1; i < size; i++) {
        // if (nums[i] == nums[i - 1]) return true;
        // }

        // Solution 3
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : nums) {
            if (duplicates.contains(num)) {
                return true;
            }
            duplicates.add(num);
        }

        return false;
    }
}
