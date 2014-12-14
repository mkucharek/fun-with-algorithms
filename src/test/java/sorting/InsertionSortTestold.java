package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTestold {

    @Test
    public void shouldSortIntegerArray() {
        //given
        InsertionSort is = new InsertionSort();
        int[] input = new int[]{5, 15, 22, 44, 6, 5, 13, 6, 7};
        int[] expectedOutput = getExpectedResult(input);

        //when
        is.sort(input);

        //then
        Assert.assertArrayEquals(expectedOutput, input);

    }

    private int[] getExpectedResult(int[] array) {
        int[] expectedInts = Arrays.copyOf(array, array.length);
        Arrays.sort(expectedInts);
        return expectedInts;
    }
}