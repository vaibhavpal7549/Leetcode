class Solution {
    public int search(int[] nums, int target) {
        int l = nums.length;
        for(int i = 0; i<l; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
        
    }
}