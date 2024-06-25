class Solution {
    public int FindCoverage(int[][] matrix) {
       
        int n = matrix.length;
        int m = matrix[0].length;
        int totalCoverage = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    totalCoverage += countOnesAround(matrix, i, j, n, m);
                }
            }
        }

        return totalCoverage;
    }
      private int countOnesAround(int[][] matrix, int i, int j, int n, int m) {
        int count = 0;

        // Check left
        if (j - 1 >= 0 && matrix[i][j - 1] == 1) {
            count++;
        }
        // Check right
        if (j + 1 < m && matrix[i][j + 1] == 1) {
            count++;
        }
        // Check up
        if (i - 1 >= 0 && matrix[i - 1][j] == 1) {
            count++;
        }
        // Check down
        if (i + 1 < n && matrix[i + 1][j] == 1) {
            count++;
        }

        return count;
    }
}

