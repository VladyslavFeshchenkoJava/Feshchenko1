package lesson7;

import java.util.Arrays;

public class SelectionSorterWithBreak {
    public static void main(String[] args) {

        int[] arr = {0, 8, 5, 2, 6};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j])
                    break;

                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }
}
