package br.pucrs;

public class MaxVal2 {
    public static int operationsCounter;

    public static long maxVal2(long[] A, int init, int end) {
        operationsCounter++;
        if (end - init <= 1) {
            return Long.max(A[init], A[end]);
        } else {

            int m = (init + end)/2;
            long v1 = maxVal2(A,init,m);
            long v2 = maxVal2(A,m+1,end);
            return Long.max(v1,v2);
        }
    }
}