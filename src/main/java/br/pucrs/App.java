package br.pucrs;

public class App
{
    public static void main( String[] args )
    {
        // long[] arr = new long[1000000];
        // for (int i = 0; i < arr.length - 1; i++) {
        //     arr[i] = (long) (Math.random() * 100);
        // }
        // long start = System.nanoTime();
        // long grt = GreaterDC.maxVal2(arr, 0, arr.length - 1);
        // long end = System.nanoTime();
        // System.out.printf("Result=%d, Operations=%d, Time=%.2f", grt, GreaterDC.operationsCounter, (double) (end - start) / 1000000);

        // // long[] arr2 = {49,55,24,72,17,54,76,81,10,5,16,23,45,78,90,12,34,67,89,100};
        // // MergeSort.mergeSort(arr2, 0, arr2.length - 1);
        // // System.out.println("Sorted array:");
        // // for (long i : arr2) {
        // //     System.out.print(i + " ");
        // // }

        // Multiplier multiplier = new Multiplier();
        // System.out.println(multiplier.multiply(5,7,4));

        // 32, 2048 e 1.048.576

        long[] arr32 = new long[32];
        for (int i = 0; i < arr32.length; i++) {
            arr32[i] = (int) (Math.random() * 100);
        }
        long[] arr2048 = new long[2048];
        for (int i = 0; i < arr2048.length; i++) {
            arr2048[i] = (int) (Math.random() * 10000);
        }
        long[] arr1048576 =  new long[1048576];
        for (int i = 0; i < arr1048576.length; i++) {
            arr1048576[i] = (int) (Math.random() * 10000000);
        }

        // int[] mergeSortResults = {1,2,3};
        // System.out.printf("MergeSort: \n");
        
        long[] maxVal1Results = {MaxVal1.maxVal1(arr32, arr32.length),
            MaxVal1.maxVal1(arr2048, arr2048.length), 
            MaxVal1.maxVal1(arr1048576, arr1048576.length)};
        System.out.printf("MaxVal1:[32=%d,2048=%d,1048576=%d]\n",
            maxVal1Results[0], maxVal1Results[1], maxVal1Results[2]);
        
         long[] maxVal2Results = {MaxVal2.maxVal2(arr32, 0, arr32.length - 1),
            MaxVal2.maxVal2(arr2048, 0, arr2048.length - 1), 
            MaxVal2.maxVal2(arr1048576, 0, arr1048576.length - 1)};
        System.out.printf("MaxVal2:[32=%d,2048=%d,1048576=%d]\n",
            maxVal2Results[0], maxVal2Results[1], maxVal2Results[2]);

        // System.out.printf("Multiplier: \n");
        // System.out.printf("BignumMultiplier: \n");
    }
}
