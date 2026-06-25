class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0, c1=0, c2=0;
        for(int el : nums){
            if(el == 0) c0++;
            else if(el ==1) c1++;
            else c2++;
        }
        int j = 0;
        while(c0-->0){
            nums[j++] = 0;
        }
        while(c1-->0){
            nums[j++] = 1;
        }
        while(c2-->0){
            nums[j++] = 2;
        }
        
    }
}