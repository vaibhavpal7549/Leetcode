class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0; 
        int ans = 0;
        int curr = 0;
        for(int j = 0; j<nums.length; j++){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            
                while(map.get(nums[j]) > k){
                    map.put(nums[i], map.getOrDefault(nums[i], 0) -1);
                    i++;
                }
            
                curr = j -i + 1;
                ans = Math.max(curr, ans);

        }

        return ans;
    }
}