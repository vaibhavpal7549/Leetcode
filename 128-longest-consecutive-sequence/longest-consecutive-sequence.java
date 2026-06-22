class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int ans = 0;
        for(int el: set){

            if(!set.contains(el-1)){

                int curr = 1;
                int c = el;
                while(set.contains(c+1)){
                    curr++;
                    c++;
                }
                ans = Math.max(curr, ans);
            }
        }
        return ans;

    }
}