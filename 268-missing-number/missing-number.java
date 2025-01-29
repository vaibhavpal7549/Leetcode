class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int totSum = (l * (l + 1))/2;
        int actualSum = 0;
        for(int el: nums){
            actualSum += el;
        }
        int missNum = totSum - actualSum;
        return missNum;
        
    }
}