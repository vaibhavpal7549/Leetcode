class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            } else {
                int val = hm.get(nums[i]);
                val++;
                hm.put(nums[i], val);
            }
        }

        int sum = 0;
        for (int x : hm.keySet()) {
            if (hm.get(x) == 1) {
                sum += x;
            }
        }

        return sum;
    }
}
