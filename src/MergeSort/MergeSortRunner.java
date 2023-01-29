package MergeSort;

import QuickSort.QuickSort;

import java.util.Arrays;

public class MergeSortRunner {

    public static void main(String[] args) {

        int[] arr={5,3,4,2};
        System.out.println("MergeSort islemi oncesi array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("*****************************");
        System.out.println("MergeSort islemi sonrasi: ");
        MergeSort.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}
