class NumArray {
int []pf;
int n;
    public NumArray(int[] nums) {
        n = nums.length;
        pf = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += nums[i];
            pf[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        
        int ans = pf[right];
        if(left-1 >= 0) ans -= pf[left-1];
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */