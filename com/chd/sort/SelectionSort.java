package com.chd.sort;

public class SelectionSort {
    private SelectionSort() {
    }

    public static <T extends Comparable<T>> void selectSort(T[] arr) {
        int right = arr.length - 1;
        int left = 0;
        while (right > left) {
            // 当right大于left的时候说明任然需要比较
            int min = left;
            int max = right;
            if (arr[min].compareTo(arr[max]) > 0) {
                // 必须做这步骤，首先是减少循环的次数，不然下面的条件是 i = min; i <= max
                // 而且不加这个步骤存在bug，当就剩两个数的时候，交换一次已经成功了，但是代码
                // 需要交换两次排序就错了。
                swap(arr, min, max);
            }
            for (int i = left + 1; i < right; ++i) {
                if (arr[i].compareTo(arr[min]) < 0) {
                    min = i;
                } else if (arr[i].compareTo(arr[max]) > 0) {
                    max = i;
                }
            }
            swap(arr, left, min);
            swap(arr, right, max);
            left++;
            right--;
        }
    }

    private static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}