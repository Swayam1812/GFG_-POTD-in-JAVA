class Solution
{
  public int padovanSequence(int n){
   final int MOD = 1000000007;
    if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        
        int p0 = 1, p1 = 1, p2 = 1;
        int p = 0;
        
        for (int i = 3; i <= n; i++) {
            p = (p1 + p0) % MOD;
            p0 = p1;
            p1 = p2;
            p2 = p;
        }
       return p; 
    }
    
}

