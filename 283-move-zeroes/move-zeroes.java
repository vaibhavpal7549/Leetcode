class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        int count = 0;
        for(int i = 0;i<nums.length; i++){
            if(nums[i] != 0){
                nums[idx++] = nums[i];
                count++;
            }
        }

        for(int i = count; i< nums.length; i++){
            nums[idx++] = 0;
        }
    }
}