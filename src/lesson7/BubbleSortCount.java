package lesson7;

import java.util.Arrays;

public class BubbleSortCount {
    public static void main(String[] args) {

        int[] arr = {0, 8, 5, 2, 6};

        sortWithCount(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sortWithCount(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int count = 0;

            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {

                    count++;
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }

            if (count == 0)
                break;
        }
    }
}
