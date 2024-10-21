public class MaxVal2 {
    public static int operationsCounter;

    public static long call(long[] A, int init, int end) {
        operationsCounter++;
        if (end - init <= 1) {
            return Long.max(A[init], A[end]);
        } else {

            int m = (init + end)/2;
            long v1 = call(A,init,m);
            long v2 = call(A,m+1,end);
            return Long.max(v1,v2);
        }
    }

    public static void resetOperationsCounter() {
        operationsCounter = 0;
    }
}