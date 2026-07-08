class Solution {

    public static int helper(int [][]dp, int grid[][], int row, int col, int n, int m){
        //out of bounds or obstacle
        if(row <0 || row >= n || col <0 || col  >= m || grid[row][col] == 1){
            return 0;
        }
        //reached destination
        if(row == n-1 && col == m-1) return 1;
        //memoisation check
        if(dp[row][col] != -1) return dp[row][col];
        //recursion down and right
        int down = helper(dp, grid, row+1, col, n, m);
        int right = helper(dp, grid, row, col+1, n, m);
        return dp[row][col] = down + right;


    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];
        for(int i = 0; i<n ;i++){
            for(int j = 0; j<m ; j++){
                dp[i][j] = -1;
            }

        }
        return helper(dp, grid, 0,0, n, m);
    }
}