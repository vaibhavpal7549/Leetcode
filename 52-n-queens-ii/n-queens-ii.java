class Solution {

    public static boolean isSafe(boolean[][] mat,int row,int col){
        int n = mat.length;
        for(int nr = row; nr>=0; nr--){
            if(mat[nr][col] == true) return false;
        }

        for(int nr = row, nc = col; nr >=0 && nc <n; nr--, nc++){
            if(mat[nr][nc]==true) return false;
        }

        for(int nr = row, nc = col ; nr >= 0 && nc >=0; nr--, nc--){
            if(mat[nr][nc]== true) return false;
        }
        return true;
    }

    public static int nQueens(boolean[][]mat, int row){
        if(row == mat.length) return 1;
        int ans = 0;
        for(int col = 0; col<mat.length; col++){
            if(isSafe(mat, row, col)){
                mat[row][col] = true;
                ans += nQueens(mat, row + 1);
                mat[row][col] = false;
            }
        }
        return ans;
    }

    public int totalNQueens(int n) {
        boolean[][] mat = new boolean[n][n];
        return nQueens(mat, 0);
    }
}