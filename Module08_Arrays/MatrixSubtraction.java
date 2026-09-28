public class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] first = {
                { 10, 20 },
                { 30, 40 }
        };

        int[][] second = {
                { 1, 2 },
                { 3, 4 }
        };

        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = first[i][j] - second[i][j];
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
