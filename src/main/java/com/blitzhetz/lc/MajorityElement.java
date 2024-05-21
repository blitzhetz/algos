package com.blitzhetz.lc;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0, m = 0;

        for (int num : nums) {
            if (count == 0)
                m = num;

            if (m == num)
                count++;
            else
                count--;
        }
        return m;
    }

    public static void main(String[] args) {
        // case 1
        int[] nums1 = { 3, 2, 3 };

        // case 2
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };

        int[] nums3 = {};

        System.out.println();
        System.out.println("Case 1: " + majorityElement(nums1));
        System.out.println("Case 2: " + majorityElement(nums2));
        System.out.println("Case 3: " + majorityElement(nums3));
    }
}
