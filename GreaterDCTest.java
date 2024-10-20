import org.junit.Test;

public class GreaterDCTest {
    @Test
    public void maxVal2TestWith32Elements()
    {
        long[] arr = new long[32];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 100);
        }

        long start = System.nanoTime();
        long val = MaxVal2.maxVal2(arr, 0, arr.length - 1);
        long end = System.nanoTime();

        System.out.printf("Result=%d, Operations=%d, Time=%.2f\n", val, MaxVal2.operationsCounter, (double) (end - start) / 1000000);

    }
    @Test
    public void maxVal2TestWith2048Elements()
    {
        long[] arr = new long[2048];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 10000);
        }

        long start = System.nanoTime();
        long val = MaxVal2.maxVal2(arr, 0, arr.length - 1);
        long end = System.nanoTime();

        System.out.printf("Result=%d, Operations=%d, Time=%.2f\n", val, MaxVal2.operationsCounter, (double) (end - start) / 1000000);

    }
    @Test
    public void maxVal2TestWith1048576Elements()
    {
        long[] arr = new long[1048576];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 1000000);
        }

        long start = System.nanoTime();
        long val = MaxVal2.maxVal2(arr, 0, arr.length - 1);
        long end = System.nanoTime();

        System.out.printf("Result=%d, Operations=%d, Time=%.2f\n", val, MaxVal2.operationsCounter, (double) (end - start) / 1000000);

    }
}
