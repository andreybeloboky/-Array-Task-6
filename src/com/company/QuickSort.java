package com.company;

public class QuickSort {
    public static void sortingAnArray(int[] arr, int from, int to) {
        if (from < to) {
            int splitIndex = SortingAlgorithm.sortingArray(arr, from, to);
            sortingAnArray(arr, from, splitIndex - 1);
            sortingAnArray(arr, splitIndex, to);
        }
    }
}
