package lesson8;

import java.util.Arrays;

public class Matrix {
    int[][] arr;
    int lines;
    int columns;

    public Matrix(int[][] arr) {
        this.arr = arr;
        lines = arr.length;
        columns = arr[0].length;
    }

    int[][] sumWithMatrix(Matrix matrix, Matrix matrix1) {

        for (int i = 0; i < matrix.lines; i++) {

            if (matrix.lines == matrix1.lines && matrix.columns == matrix1.columns) {
                for (int j = 0; j < matrix.columns; j++) {

                    matrix.arr[i][j] += matrix1.arr[i][j];
                }
            } else {

                System.out.println("Matrix sizes mismatch");
                break;
            }
        }

        return matrix.arr;
    }

    int[][] multMatrixWithNumber(Matrix matrix, int a) {

        for (int i = 0; i < matrix.lines; i++) {

            for (int j = 0; j < matrix.columns; j++) {

                matrix.arr[i][j] *= a;
            }
        }

        return matrix.arr;
    }

    int[][] multMatrixWithMatrix(Matrix matrix, Matrix matrix1) {

        int[][] newArr = new int[matrix.lines][matrix1.columns];
        for (int i = 0; i < matrix.lines; i++) {

            if (matrix.lines == matrix1.columns && matrix.columns == matrix1.lines) {
                for (int j = 0; j < matrix1.columns; j++) {

                    for (int k = 0; k < matrix.columns; k++) {

                        newArr[i][j] += matrix.arr[i][k] * matrix1.arr[k][j];
                    }
                }
            } else {

                System.out.println("Matrix sizes mismatch");
                break;
            }
        }
        matrix.arr = newArr;
        return matrix.arr;
    }

    void printMatrix() {

        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
    }
}
