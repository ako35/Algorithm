package InsertionSort;

import SelectionSort.SelectionSort;

import java.util.Arrays;

public class InsertionSortRunner {

    public static void main(String[] args) {

        int[] arr1={7,4,5,9,8,2,1};
        System.out.println("Sort islemi oncesi array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*****************************");
        System.out.println("InsertionSort islemi sonrasi: ");
        InsertionSort.insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));

    }

}
