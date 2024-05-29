class Solution {
    public static int findWinner(int n, int x, int y) {
        // Create a dp array to store results for subproblems
        boolean[] dp = new boolean[n + 1];
        
        // Base cases
        dp[0] = false;  // If there are no coins, the player to move loses
        if (n >= 1) {
            dp[1] = true;  // If there is 1 coin, the player to move wins
        }
        
        // Fill the dp array
        for (int i = 2; i <= n; i++) {
            // Check if there is a move that leaves the opponent in a losing state
            if (i >= 1 && !dp[i - 1]) {
                dp[i] = true;
            } else if (i >= x && !dp[i - x]) {
                dp[i] = true;
            } else if (i >= y && !dp[i - y]) {
                dp[i] = true;
            }
        }
        
        // The answer for n coins is whether dp[n] is True or False
        return dp[n] ? 1 : 0;
    }
}
