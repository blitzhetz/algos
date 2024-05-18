package com.blitzhetz.lc;

class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (target == nums[mid]) {
                return mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int case1[] = { 1, 3, 5, 6 };
        int target1 = 5;
        System.out.print("Case 1: ");
        int result = searchInsert(case1, target1);
        System.out.println(result);

        System.out.print("Case 2: ");
        int case2[] = { 1, 3, 5, 6 };
        int target2 = 2;
        result = searchInsert(case2, target2);
        System.out.println(result);

        System.out.print("Case 3: ");
        int case3[] = { 1, 3, 5, 6 };
        int target3 = 7;
        result = searchInsert(case3, target3);
        System.out.println(result);
    }
}
