class Solution {

    public static int reverse(int n){

        int ans = 0;
        while(n>0){
            int rem = n %10;
            ans = ans * 10 + rem;
            n = n/10;
        }
        return ans;
    }
    public int minMirrorPairDistance(int[] nums) {
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int diff = Math.abs(i - map.get(nums[i]));
                ans = Math.min(ans, diff); 
            }
            map.put(reverse(nums[i]), i);
            
        }
        return ans ==Integer.MAX_VALUE?-1:ans;
    }
}