import java.util.*;
class Solution {

    static int min_Path(int[][] dp,int[][] grid, int r, int c){
        if(r<0 || c<0) return Integer.MAX_VALUE;
        if(r==0 && c==0){
            return grid[0][0];
        }
        if(dp[r][c] != -1){
            return dp[r][c];
        }

        dp[r][c] = grid[r][c] + Math.min(min_Path(dp, grid, r-1, c), min_Path(dp, grid, r, c-1));
        return dp[r][c];
    }
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        for(int [] arr : dp){
            Arrays.fill(arr, -1);
        }
        return min_Path(dp, grid, grid.length-1, grid[0].length-1);
    }
}