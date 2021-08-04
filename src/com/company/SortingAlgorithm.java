package com.company;

/*
 * @param arr - user-entered array ;
 * @param L (from) - start of array ;
 * @param R (to) - end of array ;
 * return the final value of the initial value of the array, taking into account the shift;
 */
public class SortingAlgorithm {
    public static int sortingArray(int[] arr, int L, int R) {
        int B = L;
        while (L <= R) {
            while (arr[B] > arr[L]) {
                L++;
            }
            while (arr[R] > arr[B]) {
                R--;
            }
            if (L <= R) {
                CellExchange.exchangeOfValuesInCells(arr, L, R);
                L++;
                R--;
            }
        }
        return L;
    }
}