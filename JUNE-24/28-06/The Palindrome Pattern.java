class Solution {
    public String pattern(int[][] arr) {
        int n = arr.length;
        int minr = Integer.MAX_VALUE;
        
       
        for (int r = 0; r < n; r++) {
            if (isPalindromeRow(arr, r, n)) {
                minr = r;
                return minr + " R";
            }
        }
        
        int minc = Integer.MAX_VALUE;
        
        
        for (int c = 0; c < n; c++) {
            if (isPalindromeColumn(arr, c, n)) {
                minc = c;
                return minc + " C";
            }
        }
        
        
        return "-1";
    }

    public boolean isPalindromeRow(int[][] arr, int r, int n) {
        int j = n - 1;
        int k = 0;
        
        while (k < j) {
            if (arr[r][k] != arr[r][j]) {
                return false;
            }
            k++;
            j--;
        }
        return true;
    }

    public boolean isPalindromeColumn(int[][] arr, int c, int n) {
        int j = n - 1;
        int k = 0;
        
        while (k < j) {
            if (arr[k][c] != arr[j][c]) {
                return false;
            }
            k++;
            j--;
        }
        return true;
    }
}
