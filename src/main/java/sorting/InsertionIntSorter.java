package sorting;

/**
 * Created by mkucharek.
 */
public class InsertionIntSorter implements IntSorter {

    public void sort(int[] input) {

        if (input.length < 2) {
            return;
        }

        for (int j = 1; j < input.length; ++j) {
            int key = input[j];

            int i = j - 1;
            while (i >= 0 && input[i] > key) {
                input[i + 1] = input[i];
                i -= 1;
            }

            input[i + 1] = key;
        }
    }

}
