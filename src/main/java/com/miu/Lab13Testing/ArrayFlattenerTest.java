package com.miu.Lab13Testing;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArray() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        int[] result = arrayFlattener.flattenArray(input);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        int[][] input = null;
        int[] result = arrayFlattener.flattenArray(input);
        assertNull(result);
    }
}
