class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }
        
        // Optional: Verify if the candidate is indeed the majority element
        int freq = 0;
        for (int num : nums) {
            if (num == candidate) {
                freq++;
            }
        }

        if (freq > nums.length / 2) {
            return candidate;
        }

        // Shouldn't reach here for valid input where a majority element is guaranteed.
        return -1; 
    }
}
