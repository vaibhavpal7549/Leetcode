class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int cs = 0;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<n; i++ ){
            if(cs < 0){
                cs = 0;
            }
            cs += nums[i];
            max= Math.max(cs, max);
        }
        return max;
    }
}