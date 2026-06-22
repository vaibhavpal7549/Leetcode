class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        left[0] = 0;
        right[nums.length-1] = 0;
        int temp = 0;
        for(int i = 0; i<nums.length-1; i++){
            temp += nums[i];
            left[i+1]= temp;
        }
        temp = 0;
        for(int i = nums.length- 1; i>0; i--){
            temp += nums[i];
            right[i-1]= temp;
        }
        int ans[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;

    }
}