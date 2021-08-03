package com.company;

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
                obmen(arr, L, R);
                L++;
                R--;
            }
        }
        return L;
    }
}