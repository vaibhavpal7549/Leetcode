class Solution {

    public static int helper(ArrayList<Integer> nums, int n){
        if(n == 1) return nums.get(0);
        int a = 0;
        int b = nums.get(0);
        int c = 0;
        for(int i = 2; i<= n; i++){
            int val1 = nums.get(i-1)+a;
            int val2 = b;
            c = Math.max(val1, val2);
            a = b;
            b = c;
        }
        return c;

    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();

        for(int i = 0; i<n-1; i++){
            temp1.add(nums[i]);
        }

        for(int i = 1; i<n; i++){
            temp2.add(nums[i]);
        }

        int res1 = helper(temp1, n-1);
        int res2 = helper(temp2, n-1);

        return Math.max(res1, res2);

    }
}