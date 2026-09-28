public class MatrixSymmetry {
    static boolean isSymmetric(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 2, 4, 5 },
                { 3, 5, 6 }
        };

        System.out.println(isSymmetric(matrix));
    }
}

//A matrix is symmetric when: matrix[i][j] == matrix[j][i]
