class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count = 0;
        int idx = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<mat.length; i++){
            count = 0;
            for(int j = 0; j< mat[i].length; j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count > max){
                max = count;
                idx = i;
            }
        }
        return new int[]{idx, max};
    }
}