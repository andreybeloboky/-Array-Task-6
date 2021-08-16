package com.company;

/*
 * @param arr - user-entered array ;
 * @param L (from) - start of array ;
 * @param R (to) - end of array ;
 */
public class CellExchange {
    public static void exchangeOfValuesInCells(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
