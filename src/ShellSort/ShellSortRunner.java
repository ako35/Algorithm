package ShellSort;

import MergeSort.MergeSort;

import java.util.Arrays;

public class ShellSortRunner {

    public static void main(String[] args) {

        int[] arr={5,3,4,2};
        System.out.println("ShellSort islemi oncesi array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("*****************************");
        System.out.println("ShellSort islemi sonrasi: ");
        ShellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
