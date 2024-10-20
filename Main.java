public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nDivisao e Conquista\n");
        System.out.println("==============================");
        System.out.println("1. MergeSort");
        mergeSort();
        System.out.println("==============================");
        System.out.println("2. MaxVal1");
        maxVal1();
        System.out.println("==============================");
        System.out.println("3. MaxVal2");
        maxVal2();
        System.out.println("==============================");
        System.out.println("4. Multiply");
        multiply();
    }

    private static void mergeSort() {
        long start;
        long end;
        long[] arr;
        int n;

        n = 32;
        arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 1000);
        }

        start = System.nanoTime();
        MergeSort.call(arr, 0, arr.length - 1);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, MergeSort.operationsCounter, (double) (end - start) / 1000000);

        n = 2048;
        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) (Math.random() * 1000);
        }

        start = System.nanoTime();
        MergeSort.call(arr, 0, arr.length - 1);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, MergeSort.operationsCounter, (double) (end - start) / 1000000);

        n = 1048576;
        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) (Math.random() * 1000);
        }

        start = System.nanoTime();
        MergeSort.call(arr, 0, arr.length - 1);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, MergeSort.operationsCounter, (double) (end - start) / 1000000);
    }

    private static void maxVal1() {
        long start;
        long end;
        long[] arr;
        int n = 32;

        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) (Math.random() * 1000);
        }

        start = System.nanoTime();
        MaxVal1.call(arr, n);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, MaxVal1.operationsCounter, (double) (end - start) / 1000000);

        n = 2048;
        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) (Math.random() * 1000);
        }

        start = System.nanoTime();
        MaxVal1.call(arr, n);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, MaxVal1.operationsCounter, (double) (end - start) / 1000000);

        n = 1048576;
        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) (Math.random() * 1000);
        }

        start = System.nanoTime();
        MaxVal1.call(arr, n);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, MaxVal1.operationsCounter, (double) (end - start) / 1000000);
    }

    private static void maxVal2() {
        long start;
        long end;
        long[] arr;
        int n = 32;

        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) (Math.random() * 1000);
        }

        start = System.nanoTime();
        MaxVal2.call(arr, 0, arr.length - 1);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, MaxVal2.operationsCounter, (double) (end - start) / 1000000);

        n = 2048;
        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) (Math.random() * 1000);
        }

        start = System.nanoTime();
        MaxVal2.call(arr, 0, arr.length - 1);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, MaxVal2.operationsCounter, (double) (end - start) / 1000000);

        n = 1048576;
        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) (Math.random() * 1000);
        }

        start = System.nanoTime();
        MaxVal2.call(arr, 0, arr.length - 1);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, MaxVal2.operationsCounter, (double) (end - start) / 1000000);
    }

    private static void multiply() {
        long start;
        long end;
        long[] arr;
        int n = 4;
        arr = new long[n];

        start = System.nanoTime();
        Multiply.call((long) (Math.random() *(Math.pow(2, n) - 1)), (long) (Math.random() *(Math.pow(2, n) - 1)), n);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, Multiply.operationsCounter, (double) (end - start) / 1000000);

        n = 16;

        start = System.nanoTime();
        Multiply.call((long) (Math.random() *(Math.pow(2, n) - 1)), (long) (Math.random() *(Math.pow(2, n) - 1)), n);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, Multiply.operationsCounter, (double) (end - start) / 1000000);

        n = 64;

        start = System.nanoTime();
        Multiply.call((long) (Math.random() *(Math.pow(2, n) - 1)), (long) (Math.random() *(Math.pow(2, n) - 1)), n);
        end = System.nanoTime();

        System.out.printf("[%d] - Operations=%d, Time=%.2f\n", n, Multiply.operationsCounter, (double) (end - start) / 1000000);
    }
}
