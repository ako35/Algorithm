import BubbleSort.BubbleSort;
import InsertionSort.InsertionSort;
import MergeSort.MergeSort;
import QuickSort.QuickSort;
import SelectionSort.SelectionSort;
import ShellSort.ShellSort;

import java.util.Arrays;
import java.util.Random;

public class WhichOneIsFaster {

    /*
    
        Eger hiz onemli ise MergeSort, QuickSort, ShellSort ve Javada var olan Arrays.sort gayet hizli
        Ama uygulama daha fazla yer kaplar.

        Eger hafiza onemli ise BubbleSort, InsertionSort, SelectionSort gayet az yer kaplar
        Ama uygulama cok yavas calisir

     */

    public static void main(String[] args) {

        int[] siraliDizi=createOrderedArray(1000);

        int[] arr=createArray(10000);
        int[] arr2= Arrays.copyOf(arr,arr.length);
        int[] arr3= Arrays.copyOf(arr,arr.length);
        int[] arr4= Arrays.copyOf(arr,arr.length);
        int[] arr5= Arrays.copyOf(arr,arr.length);
        int[] arr6= Arrays.copyOf(arr,arr.length);
        int[] arr7= Arrays.copyOf(arr,arr.length);

        long startTime;
        long endTime;
        double estimatedTime;

        // InsertionSort
        startTime=System.currentTimeMillis();
        InsertionSort.insertionSort(arr);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("InsertionSort = "+estimatedTime);

        // SelectionSort
        startTime=System.currentTimeMillis();
        SelectionSort.selectionSort(arr2);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("SelectionSort = "+estimatedTime);

        // BubbleSort
        startTime=System.currentTimeMillis();
        BubbleSort.bubbleSort(arr3);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("BubbleSort = "+estimatedTime);

        // MergeSort
        startTime=System.currentTimeMillis();
        MergeSort.mergeSort(arr4,0,arr.length-1);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("MergeSort = "+estimatedTime);

        // QuickSort
        startTime=System.currentTimeMillis();
        QuickSort.quickSort(arr5,0,arr.length-1);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("QuickSort = "+estimatedTime);

        // ShellSort
        startTime=System.currentTimeMillis();
        ShellSort.shellSort(arr6);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("ShellSort = "+estimatedTime);

        // Arrays.sort()
        startTime=System.currentTimeMillis();
        Arrays.sort(arr7);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("Arrays.sort = "+estimatedTime);

        System.out.println();
        System.out.println("*******************************");
        System.out.println();

        // InsertionSort
        startTime=System.currentTimeMillis();
        InsertionSort.insertionSort(siraliDizi);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("InsertionSort = "+estimatedTime);

        // SelectionSort
        startTime=System.currentTimeMillis();
        SelectionSort.selectionSort(siraliDizi);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("SelectionSort = "+estimatedTime);

        // BubbleSort
        startTime=System.currentTimeMillis();
        BubbleSort.bubbleSort(siraliDizi);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("BubbleSort = "+estimatedTime);

        // MergeSort
        startTime=System.currentTimeMillis();
        MergeSort.mergeSort(siraliDizi,0,arr.length-1);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("MergeSort = "+estimatedTime);

        // QuickSort
        startTime=System.currentTimeMillis();
        QuickSort.quickSort(siraliDizi,0,arr.length-1);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("QuickSort = "+estimatedTime);

        // ShellSort
        startTime=System.currentTimeMillis();
        ShellSort.shellSort(siraliDizi);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("ShellSort = "+estimatedTime);

        // Arrays.sort()
        startTime=System.currentTimeMillis();
        Arrays.sort(siraliDizi);
        endTime=System.currentTimeMillis();
        estimatedTime= (double) (endTime-startTime)/1000;
        System.out.println("Arrays.sort = "+estimatedTime);

    }

    public static int[] createArray(int elemanSayisi){
        int[] arr=new int[elemanSayisi];
        Random rm=new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=rm.nextInt(10000);
        }
        return arr;
    }

    public static int[] createOrderedArray(int elemanSayisi){
        int[] arr=new int[elemanSayisi];
        for (int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        return arr;
    }

}
