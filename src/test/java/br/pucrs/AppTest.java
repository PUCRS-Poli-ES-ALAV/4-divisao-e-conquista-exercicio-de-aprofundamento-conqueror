package br.pucrs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void maxVal2Test()
    {
        long[] arr = {49,55,24,72,17};

        long result = GreaterDC.maxVal2(arr, 0, arr.length - 1);

        assertEquals(72, result);
    }
}
