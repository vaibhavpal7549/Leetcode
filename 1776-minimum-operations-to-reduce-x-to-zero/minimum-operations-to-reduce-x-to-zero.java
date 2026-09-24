class Solution {
    public int minOperations(int[] nums, int x) {
        
        int tSum = 0;
        int n = nums.length;

        for(int k = 0; k < n; k++){
            tSum += nums[k];
        }
        
        int i = 0;
        int rSum = tSum - x;
        int ans = 0;
        int cSum = 0;
        boolean found = false;

        if(rSum < 0){
            return -1;
        }

        if(rSum == 0){
            return n;
        }

        for(int j = 0; j < n; j++){
            cSum += nums[j];

            while(i <= j && cSum > rSum){
                cSum -= nums[i];
                i++;
            }

            if(cSum == rSum){
                found = true;
                ans = Math.max(ans, j - i + 1);
            }
        }

        return found ? n - ans : -1;
    }
}