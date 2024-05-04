package com.blitzhetz.sorting;

public class MergeSort {
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid); // left half
            mergeSort(arr, mid + 1, r); // right half

            merge(arr, l, mid, r); // merge two halfs
        }
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int s1 = mid - l + 1; // size of left arr
        int s2 = r - mid; // size of right arr

        int leftArr[] = new int[s1];
        int rightArr[] = new int[s2];

        for (int x = 0; x < s1; x++) {
            leftArr[x] = arr[l + x]; // copy el to left arr
        }

        for (int x = 0; x < s2; x++) {
            rightArr[x] = arr[mid + 1 + x]; // copy el to right arr
        }

        int i = 0, j = 0, k = l;

        while (i < s1 && j < s2) { // insert back el from left and right arr
            if (leftArr[i] <= rightArr[j]) { // if left el is smaller than the right one
                arr[k++] = leftArr[i++]; // add left el to main arr
            } else {
                arr[k++] = rightArr[j++]; // else add right el to main arr
            }
        }

        // this will execute only when there is diff in size of left and right arr
        for (; i < s1; i++) {
            arr[k++] = leftArr[i];
        }
        for (; j < s2; j++) {
            arr[k++] = rightArr[j];
        }

    }

    public static void main(String[] args) {

        int[] arr = { 8, 5, 9, 1, 6, 7, 3, 45, 31, 53, 42, 3, 1, 14, 5, 24, 2 };

        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting: ");

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
