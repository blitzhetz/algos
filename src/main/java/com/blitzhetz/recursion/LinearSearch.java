package com.blitzhetz.recursion;

public class LinearSearch {
    static int linearSearch(int[] arr, int target, int i) {
        // base case
        if (i == arr.length)
            return -1;

        // checck if the target el is found
        if (arr[i] == target)
            return i;

        // recursion call by incr var i by 1
        return linearSearch(arr, target, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 1, 6, 8, 10, 7 };

        int result = linearSearch(arr, 6, 0);
        System.out.println("El found at: " + result);
    }
}
