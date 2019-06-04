package com.chd.sort;

public class Main {
    public static void main(String[] args) {
        Integer [] arr = {1, 3, 4, 2, 121, 23, 2, 423, 22};
        //SelectionSort.selectSort(arr);
        BubbleSort.bubbleSort(arr);
        for (Integer i : arr){
            System.out.print(i + ", ");
        }
    }
}