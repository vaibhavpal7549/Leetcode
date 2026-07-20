class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;

        int [] temp = new int[m*n];
        int t = temp.length;
        int idx = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                temp[idx++] = grid[i][j];
            }
        }

        k %= t;
        int move = (t - k) % t;

        int idx1 = move;
        for(int i = 0 ;i<m ;i++){
            List<Integer> al = new ArrayList<>();
            for(int j = 0; j<n; j++){
               al.add(temp[idx1]);
                idx1 = (idx1 + 1) % t;
            }
            ans.add(al);
        }

        return ans;
        
    }
}