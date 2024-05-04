package com.blitzhetz.sorting;

public class InsertionSort {

    static void printArr(int arr[]) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static void insertionSort(int arr[]) {
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            int target = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = target;

            System.out.print("Iteration " + (i + 1) + ": ");
            printArr(arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };

        System.out.print("Unsorted arr: ");
        printArr(arr);

        System.out.println();

        insertionSort(arr);

        System.out.println();

        System.out.print("Sorted arr: ");
        printArr(arr);
    }
}
