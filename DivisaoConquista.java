import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DivisaoConquista {
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

        System.out.println("\nArray de Tamanho 32");
        arr = new long[32];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 100);
        }

        start = System.nanoTime();
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        end = System.nanoTime();

        System.out.printf("[32] - Operations=%d, Time=%.2f\n", MergeSort.operationsCounter, (double) (end - start) / 1000000);

        System.out.println("\nArray de Tamanho 2048");
        arr = new long[2048];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 10000);
        }

        start = System.nanoTime();
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        end = System.nanoTime();

        System.out.printf("[2048] - Operations=%d, Time=%.2f\n", MergeSort.operationsCounter, (double) (end - start) / 1000000);

        System.out.println("\nArray de Tamanho 1048576");
        arr = new long[1048576];
        for (int i = 0; i < 1048576; i++) {
            arr[i] = (long) (Math.random() * 1000000);
        }

        start = System.nanoTime();
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        end = System.nanoTime();

        System.out.printf("[1048576] - Operations=%d, Time=%.2f\n", MergeSort.operationsCounter, (double) (end - start) / 1000000);
    }

    private static void maxVal1() {
        arr = geraVetor(16, 16);
        System.err.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 100);
        }

        start = System.nanoTime();
        MaxVal1.maxVal1();
        end = System.nanoTime();
    }

    private static void maxVal2() {

    }

    private static void multiply() {

    }

    private static int[] geraVetor(int nroPares, int nroImpares){
        int [] res = null;
        int contPar = 0, contImpar = 0, novoNum;
        Random rnd = new Random();

        if ((nroPares >= 0) ||
                (nroImpares >= 0) &&
                (nroPares + nroImpares > 0)) {

            res = new int[nroPares + nroImpares];

            while ((contPar < nroPares) || (contImpar < nroImpares)) {
                novoNum = rnd.nextInt(98)+1;

                if ((novoNum % 2 == 0) && (contPar < nroPares)) {
                    res[contPar+contImpar] = novoNum;
                    contPar++;
                }
                else if ((novoNum % 2 == 1) && (contImpar < nroImpares)) {
                    res[contPar+contImpar] = novoNum;
                    contImpar++;
                }
            }
        }

        return res;
    }
}
