class Solution {

    public static int sum(int i, int j, int[] nums){
        int ans = 0;
        for(int a = i; a<=j; a++){
            ans += nums[a];
        }
        return ans;
    }
    public static boolean foundEven(int a, int i, int j, int l , int [] nums){

        int a1sum = 0;
        int a2sum = 0;
        a1sum = sum(a, i, nums);
        a2sum = sum(j, l, nums);
        int diff = a1sum - a2sum;
        if(Math.abs(diff)%2 ==0){
            return true;
        }
        return false;
    }
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n-1;i++){
            boolean ans = foundEven(0, i, i+1, n-1, nums);
            if(ans) count++; 
        }
        return count;

    }
}