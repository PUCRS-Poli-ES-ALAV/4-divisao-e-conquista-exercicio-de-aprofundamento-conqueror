package br.pucrs;

public class MergeSort {
    public static int operationsCounter;

    public static void mergeSort(long[] arr, int l, int r) {
        operationsCounter++;
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(long[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        long[] L = new long[n1];
        long[] R = new long[n2];

        for(int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
            operationsCounter++;
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
            operationsCounter++;
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            operationsCounter++;
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            operationsCounter++;
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            operationsCounter++;
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
