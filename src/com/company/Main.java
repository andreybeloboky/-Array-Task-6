package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {32, 1, 23, 12};
        QuickSort.sortingAnArray(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
