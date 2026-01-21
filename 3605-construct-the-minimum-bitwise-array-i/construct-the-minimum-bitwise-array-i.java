class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int [] ans = new int[n];
        for(int i = 0; i<n; i++){
            int a = nums.get(i);
            if(a%2 == 0){
                ans[i] = -1;
                continue;
            }

            int f = -1;
            for(int j = 0; j<a; j++){
                if((j | j+1) == a){
                    ans[i] = j;
                    break;
                }
            }
        }
        return ans;
    }
}
