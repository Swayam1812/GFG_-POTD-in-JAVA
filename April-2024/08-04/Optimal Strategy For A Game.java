class solve
{
    static long countMaximum(int n, int arr[])
    {
        long[][] dp = new long[n][n];

        for (int len = 0; len < n; len++) {
            for (int i = 0; i + len < n; i++) {
                int j = i + len;

                if (i == j) {
                    dp[i][j] = arr[i];
                } else if (i + 1 == j) {
                    
                    dp[i][j] = Math.max(arr[i], arr[j]);
                } else {
                  
                    long pickFirst = arr[i] + Math.min(dp[i + 2][j], dp[i + 1][j - 1]);
                   
                    long pickLast = arr[j] + Math.min(dp[i + 1][j - 1], dp[i][j - 2]);

                    dp[i][j] = Math.max(pickFirst, pickLast);
                }
            }
        }
        return dp[0][n - 1];
    }
}
