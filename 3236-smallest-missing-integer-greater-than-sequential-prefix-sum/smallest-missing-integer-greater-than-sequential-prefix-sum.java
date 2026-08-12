class Solution {
    public int missingInteger(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int el: nums){
            set.add(el);
        }
        int sum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] -1 == nums[i-1]){
                sum += nums[i];
            }
            else{
                break;
            }

        }
        while (set.contains(sum)) {
            sum++;
        }


        return sum;


    }
}