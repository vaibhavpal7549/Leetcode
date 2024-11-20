class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s = 0;
        int e = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while(e<nums.length){
            sum += nums[e];
            if(e-s+1<k){
                e++;
            }
            else if((e-s+1) == k){
                maxSum = Math.max(maxSum, sum);
                sum = sum - nums[s];
                s++;
                e++;
            }
        }
        
        return (double) maxSum / k;
        
    }
}