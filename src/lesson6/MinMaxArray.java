package lesson6;

import java.util.Arrays;
import java.lang.reflect.Array;

public class MinMaxArray {
    public static void main(String[] args) {

        int[][] arr = new int[5][8];
        int[][] arrMinMax = new int[5][2];

        initialArray(arr);
        System.out.println();
        initialArrMinMax(arr, arrMinMax);
    }

    static int[][] initialArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = (int) (Math.random() * 50);
            }

            Arrays.sort(arr[i]);
            System.out.println(Arrays.toString(arr[i]));

            System.arraycopy(arr[i], arr[i].length - 1, arr[i], 1, 1);
        }

        return arr;
    }

    static int[][] initialArrMinMax(int[][] arr, int arrMinMax[][]) {

        for (int i = 0; i < arrMinMax.length; i++) {

            for (int j = 0; j < arrMinMax[i].length; j++) {

                arrMinMax[i][j] = arr[i][j];
            }
            System.out.println(Arrays.toString(arrMinMax[i]));
        }

        return arrMinMax;
    }
}
