package br.pucrs;

public class BignumMultiplier {
    public static long multiply(String x, String y) {
        // if (x.length() <= 2) {
        //     int xInt = Integer.parseInt(x);
        //     int yInt = Integer.parseInt(y);
        //     return xInt * yInt;
        // }

        String xFirstHalf = x.substring(0, x.length() / 2);
        String xLastHalf = x.substring(x.length() / 2, x.length());
        String yFirstHalf = y.substring(0, y.length() / 2);
        String yLastHalf = y.substring(y.length() / 2, y.length());

        // String str = xFirstHalf + yFirstHalf + " + " + xLastHalf + yFirstHalf + " + " + xFirstHalf + yLastHalf + " + " + xLastHalf + yLastHalf;

        return (4 * multiply(xFirstHalf, yFirstHalf)) + (2 * (multiply(xLastHalf, yFirstHalf) + multiply(xFirstHalf, yLastHalf))) + multiply(xLastHalf, yLastHalf);
    }
}