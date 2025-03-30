class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i<mat.length; i++){
            //pd
            sum += mat[i][i];
            if(i != mat.length-i-1){
                sum += mat[i][mat.length-i-1];
            }
        }
        return sum;

        // int sum = 0;
        // for(int i = 0; i<mat.length; i++){
        //     for(int j = 0; j<mat[0].length; j++){
        //         if(i==j){
        //             sum += mat[i][j];
        //         }
        //         else if((i+j)==(mat.length-1)){
        //             sum += mat[i][j];
        //         }
        //     }
        // }

        // return sum;


    }
}