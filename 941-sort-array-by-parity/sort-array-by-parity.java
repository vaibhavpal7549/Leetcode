class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int lp = 0;
        int ans[] = new int[nums.length];
        int rp = nums.length-1;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]%2==0){
                ans[lp++] = nums[i]; 
            }else{
                ans[rp--] = nums[i];
            }
        }
        return ans;
    }
}