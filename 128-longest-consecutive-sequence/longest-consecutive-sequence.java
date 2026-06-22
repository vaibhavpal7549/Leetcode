class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0){
            return 0;
        }
        int curl = 1;
        int max = 1;

        for(int i = 1; i<nums.length; i++){

            if(nums[i] == nums[i-1]){
                continue;
            }else if(nums[i] == nums[i-1] + 1){
                curl++;
            }else{
                max = Math.max(curl, max);
                curl = 1;
            }

        }
        return Math.max(curl, max);
    }
}