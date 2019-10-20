package lesson8;

public class MatrixDemo {
    public static void main(String[] args) {

        int[][] arr = {{3, 3, 3, 3}, {3, 3, 3, 3}, {3, 3, 3, 3}};
        int[][] arr1 = {{4, 4, 4, 4}, {4, 4, 4, 4}, {4, 4, 4, 4}};
        int[][] arr2 = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}, {2, 2, 2}};

        Matrix matrix = new Matrix(arr);
        Matrix matrix1 = new Matrix(arr1);
        Matrix matrix2 = new Matrix(arr2);

        matrix.multMatrixWithNumber(matrix, 5);
        matrix.printMatrix();
        System.out.println();

        matrix.sumWithMatrix(matrix, matrix1);
        matrix.printMatrix();
        System.out.println();

        matrix.multMatrixWithMatrix(matrix, matrix2);
        matrix.printMatrix();
        System.out.println();
    }
}
