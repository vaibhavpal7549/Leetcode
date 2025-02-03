class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int m = n * 2;
        int ans[]= new int[m];
        for(int i = 0; i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
        
    }
}