class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean  ch = true;
        int n = nums.length;

        for(int x: nums){
            xor = xor ^ x;
            if(x != 0){
                ch = false;
            }
        }

        if(ch){
            return 0;
        }
        if(xor == 0) return (n-1);
        return n;

    
    }
}