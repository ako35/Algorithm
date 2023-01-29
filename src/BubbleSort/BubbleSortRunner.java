package BubbleSort;

import java.util.Arrays;

public class BubbleSortRunner {

    public static void main(String[] args) {

        int[] arr={3,1,2};
        System.out.println("BubbleSort islemi oncesi array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("*****************************");
        System.out.println("BubbleSort islemi sonrasi: ");
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
