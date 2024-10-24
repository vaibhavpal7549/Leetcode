import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store the unique elements
        HashSet<Integer> number = new HashSet<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the number is already in the set, return true (duplicate found)
            if (number.contains(nums[i])) {
                return true;
            } else {
                // Add the number to the set if it's not already present
                number.add(nums[i]);
            }
        }
        
        // If no duplicates are found, return false
        return false;
    }
}
