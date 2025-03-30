class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>st = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //Top
            for(int j = startCol; j<=endCol; j++){
                st.add(matrix[startRow][j]);
            }
            

            //Right
            for(int i = startRow + 1; i<=endRow; i++){
                st.add(matrix[i][endCol]);
            }

            //Bottom
            for(int j = endCol-1; j>=startCol; j--){
                if(startRow==endRow){
                    break;
                }
                st.add(matrix[endRow][j]);
            }

            //Left
            for(int i = endRow-1; i>=startRow+1; i--){
                if(startCol==endCol){
                    break;
                }
                st.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return st;
        
    }
}