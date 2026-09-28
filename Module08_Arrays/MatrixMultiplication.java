public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] first = {
                { 1, 2 },
                { 3, 4 }
        };

        int[][] second = {
                { 5, 6 },
                { 7, 8 }
        };

        int[][] result = new int[2][2];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < second.length; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}
