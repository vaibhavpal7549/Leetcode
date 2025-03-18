class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;

        int minidx = 0, maxidx = 0;
        for(int i = 1; i<n ;i++){
            if(nums[i] < nums[minidx]) minidx = i;
            if(nums[i] > nums[maxidx]) maxidx = i;
        }
        if(minidx > maxidx){
            int temp = minidx;
            minidx = maxidx;
            maxidx = temp;
        }
        int option1 = maxidx + 1;
        int option2 = n - minidx;
        int option3 = (minidx + 1) + (n - maxidx);
        return Math.min(option1, Math.min(option2, option3));
    }
}