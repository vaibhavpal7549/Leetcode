class Solution {
    public int countPartitions(int[] nums) {

        int n = nums.length;
        int totalSum = 0;

        for(int x : nums) totalSum += x;

        int prefix = 0;
        int count = 0;

        for(int i = 0; i < n - 1; i++){
            prefix += nums[i];
            
            // right sum = total - prefix
            int right = totalSum - prefix;

            // check even-difference
            if((prefix % 2) == (right % 2)){
                count++;
            }
        }
        return count;
    }
}
