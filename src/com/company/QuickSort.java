package com.company;

public class QuickSort {
    /**
     * @param arr  - user-entered array ;
     * @param from - start of array ;
     * @param to   - end of array ;
     */
    public static void sortingAnArray(int[] arr, int from, int to) {
        if (from < to) {
            int splitIndex = sortingArray(arr, from, to);
            sortingAnArray(arr, from, splitIndex - 1);
            sortingAnArray(arr, splitIndex, to);
        }
    }

    /**
     * @param arr   - user-entered array ;
     * @param left  (from) - start of array ;
     * @param right (to) - end of array ;
     * @return the final value of the initial value of the array, taking into account the shift;
     */
    public static int sortingArray(int[] arr, int left, int right) {
        int center = left;
        while (left <= right) {
            while (arr[center] > arr[left]) {
                left++;
            }
            while (arr[right] > arr[center]) {
                right--;
            }
            if (left <= right) {
                exchangeOfValuesInCells(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    /**
     * @param arr   - user-entered array ;
     * @param left  (from) - start of array ;
     * @param right (to) - end of array ;
     */
    public static void exchangeOfValuesInCells(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}