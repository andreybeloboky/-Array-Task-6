package com.company;

/*
 * @param arr - user-entered array ;
 * @param L (from) - start of array ;
 * @param R (to) - end of array ;
 * return the final value of the initial value of the array, taking into account the shift;
 */
public class SortingAlgorithm {
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
                CellExchange.exchangeOfValuesInCells(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
}