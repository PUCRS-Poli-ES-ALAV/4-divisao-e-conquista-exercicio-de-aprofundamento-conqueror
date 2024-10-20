public class MaxVal1 {
    public static int operationsCounter;

    public static long call(long A[], int n) {  
        long max = A[0];
        for (int i = 1; i < n; i++) {
            operationsCounter++; 
            if( A[i] > max ) 
               max = A[i];
        }
        return max;
    }
}
