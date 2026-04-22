class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int ans[][] = new int[matrix.length][matrix[0].length];
        int col[] = new int[matrix[0].length];
        for(int i = 0; i<matrix[0].length; i++){
            int max = Integer.MIN_VALUE;
            int j = 0;
            while(j<matrix.length){
                if(matrix[j][i] > max){
                    max = matrix[j][i];
                }
                j++;
            }
            col[i] = max;
        }



        for(int i = 0; i<matrix.length; i++){
            for(int j = 0;  j <matrix[0].length; j++){
                if(matrix[i][j] != -1){
                    ans[i][j] = matrix[i][j];
                }else{
                    ans[i][j] = col[j];
                }
            }
        }
        return ans;
    }
}