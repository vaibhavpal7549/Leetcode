class Solution {
    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        
        int m = arr.length;
        int n = arr[0].length;
        while(k-->0){
            int prev = arr[m-1][n-1];
            int curr = arr[0][0];

            for(int i = 0;i<m;i++){
                for(int j = 0; j<n; j++){
                    if(i == 0 && j == 0){
                        arr[i] [ j] = prev;
                    }else{
                        curr = arr[i][j];
                        arr[i][j] = prev;
                    }
                    prev = curr;
                }
            }


        }
        List<List<Integer>> ans = new ArrayList<>();

        
            

            for(int i = 0; i<m; i++){
                List<Integer> al = new ArrayList<>();
                for(int j = 0; j <n; j++){
                    al.add(arr[i][j]);
                }
                ans.add(al);

            }
            return ans;
    
    }
}