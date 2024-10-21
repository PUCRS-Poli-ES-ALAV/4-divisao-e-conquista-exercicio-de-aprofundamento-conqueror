/*
    A Multiplicação Inteira de n-bits recebe dois números inteiros x e y de n-bits e retorna o resutado de x * y.

    Assim, novamente:

    implemente o algortimo abaixo;
    teste-o para os 3 casos de valores inteiros: com 4 bits, com 16 bits e com 64 bits. Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto.
 */
public class Multiply {
    public static int operationsCounter;

    public static long call(long x, long y, long n) {
        operationsCounter++;
        long m, a, b, c, d, e, f, g, h;
        if (n == 1)
            return (long) (x * y);
        else {
            m = n / 2;
            a = (long) (x / Math.pow(2, m));
            b = (long) (x % Math.pow(2, m));
            c = (long) (y / Math.pow(2, m));
            d = (long) (y % Math.pow(2, m));
            e = call(a, c, m);
            f = call(b, d, m);
            g = call(b, c, m);
            h = call(a, d, m);
            return (long) (Math.pow(2, 2*m) * e + Math.pow(2, m)*(g + h) + f);
        }
    }

    public static void resetOperationsCounter() {
        operationsCounter = 0;
    }
}