package br.pucrs;

public class App 
{
    public static void main( String[] args )
    {
        long[] arr = {49,55,24,72,17};
        long grt = GreaterDC.maxVal2(arr, 0, arr.length - 1);
        System.out.println(grt);
    }
}
