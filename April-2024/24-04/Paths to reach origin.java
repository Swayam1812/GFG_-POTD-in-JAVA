class Solution {
    static int MOD = 1000000007;
    public static int solve(int x, int y){
        if (x==0 && y==0) return 1;
        if (x<0 || y<0) return 0;

        int left = solve(x-1, y) % MOD;
        int down = solve(x, y-1) % MOD;

        return (left+down) % MOD;
    }
    public static int solveMem(int x, int y, int dp[][]){
        if (x==0 && y==0) return 1;
        if (x<0 || y<0) return 0;

        if (dp[x][y]!=-1) return dp[x][y];

        int left = solveMem(x-1, y, dp) % MOD;
        int down = solveMem(x, y-1, dp) % MOD;

        dp[x][y]=(left+down) % MOD;
        return dp[x][y];
    }
    public static int ways(int n, int m) {
        // complete the function
        // return solve(n, m);
        int dp[][] = new int[n+1][m+1];
        for (int i=0; i<n+1; i++){
            for (int j = 0; j<m+1; j++){
                dp[i][j] = -1;
            }
        }
        return solveMem(n, m, dp);
    }
}
