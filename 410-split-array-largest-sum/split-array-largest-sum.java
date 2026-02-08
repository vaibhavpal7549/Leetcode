class Solution {
    public static boolean helper(int nums[], int k, int mid){
        int val = nums[0];
        int count = 1;
        for(int i = 1; i<nums.length; i++){
            val += nums[i];
            if(val>mid){
                count++;
                val = nums[i];
            }
        }
        return count<=k;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int maxVal = nums[0];
        int sum = nums[0];
        for(int i = 1; i<n; i++){
            sum += nums[i];
            maxVal = Math.max(maxVal, nums[i]);
        }
        int low = maxVal;
        int high = sum;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(helper(nums, k, mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    
}