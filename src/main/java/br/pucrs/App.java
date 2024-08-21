package br.pucrs;

public class App
{
    public static void main( String[] args )
    {
        GreaterDC greaterDC = new GreaterDC();
        long[] arr = new long[1000000];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (long) (Math.random() * 100);
        }
        long start = System.nanoTime();
        long grt = greaterDC.maxVal2(arr, 0, arr.length - 1);
        long end = System.nanoTime();
        System.out.printf("Result=%d, Operations=%d, Time=%.2f", grt, greaterDC.operationsCounter, (double) (end - start) / 1000000);

        long[] arr2 = {49,55,24,72,17,54,76,81,10,5,16,23,45,78,90,12,34,67,89,100};
        MergeSort.mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array:");
        for (long i : arr2) {
            System.out.print(i + " ");
        }
    }
}
