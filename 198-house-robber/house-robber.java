class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int a = 0;
        int b = nums[0];
        int c = 0;
        for(int i = 2; i<= n; i++){
            int val1 = nums[(i-1)]+a;
            int val2 = b;
            c = Math.max(val1, val2);
            a = b;
            b = c;
        }
        return c;
    }
}