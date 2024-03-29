class Solution {
    public static int solve(int row, int col, int i, int j, int[][] mat, int[][] visited, int cnt)
    {
        if(i==row || i<0 || j==col || j<0 || mat[i][j]==-1 || visited[i][j]==1)
            return Integer.MAX_VALUE;
        if(j == col-1)
        {
            return cnt;
        }
        visited[i][j] = 1;
        int l1 = solve(row, col, i+1, j, mat, visited, cnt+1);
        int l2 = solve(row, col, i-1, j, mat, visited, cnt+1);
        int l3 = solve(row, col, i, j+1, mat, visited, cnt+1);
        int l4 = solve(row, col, i,j-1, mat, visited, cnt+1);
        visited[i][j] = 0;
        return Math.min(l1,Math.min(l2, Math.min(l3,l4)));
    }
    public static int findShortestPath(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int min = Integer.MAX_VALUE;
        int[][] visited = new int[row][col];
        
        for(int i = 0; i < row; i++ )
        {
             for(int j = 0; j < col; j++)
             {
                 if(mat[i][j]==0)
                 {
                     if(i-1>=0)
                       mat[i-1][j] = -1; 
                       
                     if(i+1 < row)
                       mat[i+1][j] = -1;
                     
                     if(j-1 >= 0)
                       mat[i][j-1] = -1;
                     
                     if(j+1 < col)
                      mat[i][j+1] = -1;
                      
                     
                 }
             }
        }
        
        for(int i = 0; i < row; i++)
        {
            if(mat[i][0] == 1)
              min = Math.min(min, solve(row, col, i, 0, mat, visited,0));
        }
        return min == Integer.MAX_VALUE? -1: min+1;
    }
}
