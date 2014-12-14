package testutils;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by mkucharek.
 */
public final class ArrayUtils {

    private static final Random RANDOM = new Random();

    private ArrayUtils() {}

    public static int[] generateRandomArray(int minSize, int maxSize, int maxIntValue) {
        int size = minSize + RANDOM.nextInt(maxSize - minSize);

        int[] randomArray = new int[size];
        for (int i = 0; i < size; ++i) {
            randomArray[i] = RANDOM.nextInt(maxIntValue);
        }

        return randomArray;
    }

    public static int[] getExpectedResult(int[] array) {
        int[] expectedInts = Arrays.copyOf(array, array.length);
        Arrays.sort(expectedInts);
        return expectedInts;
    }
}
