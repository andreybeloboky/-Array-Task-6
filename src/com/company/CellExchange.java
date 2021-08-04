package com.company;

/*
 * @param arr - user-entered array ;
 * @param L (from) - start of array ;
 * @param R (to) - end of array ;
 */
public class CellExchange {
    public static void exchangeOfValuesInCells(int[] arr, int L, int R) {
        int temp = arr[L];
        arr[L] = arr[R];
        arr[R] = temp;
    }
}
