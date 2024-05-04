package com.blitzhetz.sorting;

public class SelectionSort {

    static void printArr(int arr[]) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static void selectionSort(int arr[]) {
        int size = arr.length;
        int temp = 0;
        int minIndex = -1;

        // we can set i < size but we will get one more iteration here when arr is
        // already sorted
        for (int i = 0; i < size - 1; i++) {

            // find the minium el in unsorted arr
            minIndex = i;
            // we can extract this part in another method
            // but it is okay here
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap the found minim el with the first el
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.print("Iteration " + (i + 1) + ": ");
            printArr(arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };

        System.out.print("Unsorted arr: ");
        printArr(arr);

        System.out.println();

        selectionSort(arr);

        System.out.println();

        System.out.print("Sorted arr: ");
        printArr(arr);
    }
}
