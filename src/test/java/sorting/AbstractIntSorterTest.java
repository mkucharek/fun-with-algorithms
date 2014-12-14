package sorting;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import testutils.ArrayUtils;
import testutils.repeat.Repeat;
import testutils.repeat.RepeatRule;

public abstract class AbstractIntSorterTest {

    public static final int MIN_ARR_SIZE = 1000;
    public static final int MAX_ARR_SIZE = 10000;
    public static final int MAX_ARR_INT_VALUE = 10000;

    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    protected IntSorter sorter;

    public AbstractIntSorterTest(IntSorter sorter) {
        this.sorter = sorter;
    }

    @Test
    public void shouldSortFixedIntegerArray() {
        testArraySorting(new int[]{5, 15, 22, 44, 6, 5, 13, 6, 7});
    }

    @Test
    @Repeat(times = 10)
    public void shouldSortRandomIntegerArrays() {
        int[] input = ArrayUtils.generateRandomArray(MIN_ARR_SIZE, MAX_ARR_SIZE, MAX_ARR_INT_VALUE);
        testArraySorting(input);
    }


    private void testArraySorting(int[] input) {
        //given
        int[] expectedOutput = ArrayUtils.getExpectedResult(input);

        //when
        sorter.sort(input);

        //then
        Assert.assertArrayEquals(expectedOutput, input);

    }


}