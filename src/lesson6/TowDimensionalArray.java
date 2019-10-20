package lesson6;

public class TowDimensionalArray {
    public static void main(String[] args) {

        char c = 'a';
        String[][] arr = new String[3][6];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 6; j++) {

                arr[i][j] = c + "" + (j + 1);
                System.out.print(arr[i][j] + " ");
                c = (char) (c + 1);
            }
            System.out.println();
        }
    }
}
