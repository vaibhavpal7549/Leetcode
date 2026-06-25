class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length-1;
        while(m <= h){
            if(nums[m] == 0){
                swap(nums, m, l);
                m++;
                l++;
            }
            else if(nums[m] == 1) m++;
            else{
                swap(nums,m, h );
                
                h--;
            }
        }
    }
    static void swap(int [] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}