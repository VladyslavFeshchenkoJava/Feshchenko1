package lesson16;

public class GenMatrix<T extends Integer> {
    private T[][] arr;
    private int lines;
    private int columns;

    public GenMatrix(T[][] arr) {
        this.arr = arr;
        lines = arr.length;
        columns = arr[0].length;
    }

    T[][] sumWithMatrix(GenMatrix genMatrix1, GenMatrix genMatrix2) {
        for (int i = 0; i < genMatrix1.lines; i++) {
            if (genMatrix1.lines == genMatrix2.lines && genMatrix1.columns == genMatrix2.columns) {
                for (int j = 0; j < genMatrix1.columns; j++) {

                    genMatrix1.arr[i][j] += genMatrix2.arr[i][j];
                }
            } else {
                System.out.println("Matrix sizes mismatch");
                break;
            }
        }
        return (T[][]) genMatrix1.arr;
    }

    T[][] multMatrixWithNumber(GenMatrix genMatrix1, int a) {

        for (int i = 0; i < genMatrix1.lines; i++) {

            for (int j = 0; j < genMatrix1.columns; j++) {

                genMatrix1.arr[i][j] *= a;
            }
        }

        return (T[][]) genMatrix1.arr;
    }

//    T[][] multMatrixWithMatrix(GenMatrix genMatrix1, GenMatrix genMatrix2) {
//
//        GenMatrix<?>[][] newArr = new GenMatrix<?>[genMatrix1.lines][genMatrix2.columns];
//        for (int i = 0; i < genMatrix1.lines; i++) {
//
//            if (genMatrix1.lines == genMatrix2.columns && genMatrix1.columns == genMatrix2.lines) {
//                for (int j = 0; j < genMatrix2.columns; j++) {
//
//                    for (int k = 0; k < genMatrix1.columns; k++) {
//
//                        newArr[i][j] += genMatrix1.arr[i][k] * genMatrix2.arr[k][j];
//                    }
//                }
//            } else {
//
//                System.out.println("Matrix sizes mismatch");
//                break;
//            }
//        }
//        genMatrix1.arr = newArr;
//        return (T[][]) genMatrix1.arr;
//    }
}
