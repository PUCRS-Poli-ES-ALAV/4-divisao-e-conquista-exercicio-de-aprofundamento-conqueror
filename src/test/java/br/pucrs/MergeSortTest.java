package br.pucrs;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void mergeSortTest()
    {
        long[] arr = {49,55,24,72,17};

        MergeSort.mergeSort(arr, 0, arr.length - 1);

        long[] expected = {17,24,49,55,72};

        assertArrayEquals(expected, arr);
    }
}
