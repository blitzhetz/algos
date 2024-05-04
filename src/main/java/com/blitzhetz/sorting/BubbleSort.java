package com.blitzhetz.sorting;

public class BubbleSort {

    static void printArr(int arr[]) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int arr[]) {
        int size = arr.length;
        int temp = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 4, 3, 8 };

        System.out.print("Unsorted arr: ");
        printArr(arr);

        // System.out.println();

        System.out.print("Sorted arr: ");
        bubbleSort(arr);
        printArr(arr);
    }
}
