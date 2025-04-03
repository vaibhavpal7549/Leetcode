class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans= 0;
        int minMax = 0;
        int max = 0;
        for(int el: nums){
            ans = Math.max(ans, (long)minMax * el);
            minMax = Math.max(minMax, max - el);
           max =  Math.max(max, el);
        }
        return ans;
        
    }
}