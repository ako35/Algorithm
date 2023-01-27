package BigO;

import java.util.Arrays;

public class O1 { // O(1) -> Constant Complexity

    public static void main(String[] args) {

        int[] arr={10,2,20,40,55,7};
        // task: array in son elemanini ekrana basin
        System.out.println(arr[arr.length-1]);

        // task: verilen bir sayinin cift olup olmama durumu
        int x=24;
        if (x%2==0){
            System.out.println(x+" sayisi cift sayidir");
        } else System.out.println(x+" sayisi tek sayidir");

        boolean ciftMi=x%2==0;
        System.out.println(ciftMi);

    }

}
