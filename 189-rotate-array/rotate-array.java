class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int ans[] = new int[l];
        int idx = 0;
        int p =  k % l;
        for(int i = l-p; i<l; i++){
            ans[idx++] = nums[i];
        }
        for(int i = 0; i<l-p; i++){
            ans[idx++] = nums[i];
        }
        for(int i = 0; i<l; i++){
            nums[i] = ans[i];
        }
        
    }
}