package com.blitzhetz.searching;

public class BinarySearch {

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target)
                return mid; // el found return
            else if (arr[mid] < target)
                start = mid + 1; // search in the right half
            else
                end = mid - 1; // search in the left half
        }

        return -1;
    }

    public static void main(String[] a) {

        int arr[] = { 1, 3, 4, 5, 6 };

        int target = 3;
        int index = binarySearch(arr, target);

        if (index == -1)
            System.out.println("el not found");
        else
            System.out.println("el found at index: " + index);

    }
}
