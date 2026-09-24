class Solution {

    public static int sum(int num){
        int sum = 0;
        while(num>0){
            int ld = num%10;
            sum += ld;
            num = num/10;

        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int idx = -1;

        for(int i = 0; i<nums.length; i++){
            if(i == sum(nums[i])){
                return i;
            }else{
                continue;
            }
        }

        return idx;

    }
}