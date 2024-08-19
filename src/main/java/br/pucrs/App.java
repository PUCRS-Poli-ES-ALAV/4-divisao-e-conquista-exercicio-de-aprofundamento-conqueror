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
    }
}
