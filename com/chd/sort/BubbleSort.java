package com.chd.sort;

public class BubbleSort {
    private BubbleSort() {
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        do {
            int newN = 0;  // 通过newN来优化，记录最后一次交换的位置，以后的数据都不用考虑。
            for (int i = 1; i < n; ++i) {
                if (arr[i].compareTo(arr[i - 1]) < 0) {
                    swap(arr, i, i -1);
                    newN = i;
                }
            }
            n = newN;
        } while (n > 0);
    }

    private static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}