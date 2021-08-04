package com.company;

/*
 * @param arr - user-entered array ;
 * @param from - start of array ;
 * @param to - end of array ;
 */
public class QuickSort {
    public static void sortingAnArray(int[] arr, int from, int to) {
        if (from < to) {
            int splitIndex = SortingAlgorithm.sortingArray(arr, from, to);
            sortingAnArray(arr, from, splitIndex - 1);
            sortingAnArray(arr, splitIndex, to);
        }
    }
}
