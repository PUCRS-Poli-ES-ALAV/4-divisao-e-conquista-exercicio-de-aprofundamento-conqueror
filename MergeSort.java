/**
 * Vamos começar com um algorítmo já estudado e conhecido (em AEDI). O Merge Sort é um algorítmo de ordenação baseado nos seguintes passos:
    recursivamente ordene a metade esquerda do vetor
    recursivamente ordene a metade direita do vetor
    mescle (faça o merge) das duas metades para ter o vetor ordenado.
    Assim:

    implemente o algortimo abaixo;
    teste-o para vetores de inteiros com conteúdos randômicos, e tamanho 32, 2048 e 1.048.576. Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto;
    MERGE-SORT(L: List with n elements) : Ordered list with n elements
        IF (list L has one element)
            RETURN L.
        Divide the list into two halves A and B.
        A ← MERGE-SORT(A).
        B ← MERGE-SORT(B).
        L ← MERGE(A, B).
        RETURN L. 
*/
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
