class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans = 1;
        int countZero = 0;
        int res[] = new int[nums.length];
        for(int i = 0;i<nums.length; i++){
            if(nums[i] == 0){
                countZero++;
            }else{
                ans *= nums[i];
            }
            
        }
        for(int i = 0; i<nums.length; i++){
            if(countZero ==0){
                res[i] = ans / nums[i];
            }else if(countZero == 1){
                if(nums[i] != 0){
                    res[i] = 0;
                }else{
                    res[i] = ans;
                }
            }else if(countZero>=2){
                res[i] = 0;
            }
            
        }
        return res;
    }
}