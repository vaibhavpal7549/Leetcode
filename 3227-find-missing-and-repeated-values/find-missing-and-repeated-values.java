class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []ans = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<grid.length; i++){
            for(int j = 0 ; j<grid[0].length; j++){
                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        for(int i = 1;i<=(grid.length * grid.length ) ; i++){
            if(set.contains(i)){
                continue;
            }else{
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}