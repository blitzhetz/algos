package com.blitzhetz.sorting;

public class QuickSort {

    static void printArr(int arr[]) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };

        System.out.print("Unsorted arr: ");
        printArr(arr);

        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println();

        System.out.print("Sorted arr: ");
        printArr(arr);
    }
}
