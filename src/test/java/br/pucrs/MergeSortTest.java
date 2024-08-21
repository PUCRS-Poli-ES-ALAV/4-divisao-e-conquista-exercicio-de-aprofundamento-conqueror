package br.pucrs;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void mergeSortTestWith32Elements()
    {
        long[] arr = new long[32];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 100);
        }

        long start = System.nanoTime();
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        long end = System.nanoTime();

        System.out.printf("[32] - Operations=%d, Time=%.2f\n", MergeSort.operationsCounter, (double) (end - start) / 1000000);

        long[] expected = arr.clone();
        long[] actual = arr.clone();
        MergeSort.operationsCounter = 0;
        MergeSort.mergeSort(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSortTestWith2048Elements()
    {
        long[] arr = new long[2048];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 10000);
        }

        long start = System.nanoTime();
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        long end = System.nanoTime();

        System.out.printf("[2048] - Operations=%d, Time=%.2f\n", MergeSort.operationsCounter, (double) (end - start) / 1000000);

        long[] expected = arr.clone();
        long[] actual = arr.clone();
        MergeSort.operationsCounter = 0;
        MergeSort.mergeSort(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSortTestWith1048576Elements()
    {
        long[] arr = new long[1048576];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 1000000);
        }

        long start = System.nanoTime();
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        long end = System.nanoTime();

        System.out.printf("[1048576] - Operations=%d, Time=%.2f\n", MergeSort.operationsCounter, (double) (end - start) / 1000000);

        long[] expected = arr.clone();
        long[] actual = arr.clone();
        MergeSort.operationsCounter = 0;
        MergeSort.mergeSort(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }
}
