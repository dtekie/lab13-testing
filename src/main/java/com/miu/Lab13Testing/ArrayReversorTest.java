package com.miu.Lab13Testing;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayReversorTest {

    @Test
    public void testReverseArray() {
        ArrayReversor arrayReversor = new ArrayReversor();

        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] reversedArray = {9, 5, 4, 0, 3, 1};

        int[] result = arrayReversor.reverseArray(input);
        assertArrayEquals(reversedArray, result);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        ArrayReversor arrayReversor = new ArrayReversor();

        int[][] input = null;

        int[] result = arrayReversor.reverseArray(input);
        assertNull(result);
    }
}
