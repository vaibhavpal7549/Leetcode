import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numIndexMap.containsKey(nums[i]) && i - numIndexMap.get(nums[i]) <= k) {
                return true;
            }
            numIndexMap.put(nums[i], i);
        }
        
        return false;
    }
}
