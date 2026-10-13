class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int MOD = (int)(1e9 + 7);

        int count[] = new int[32];
        int ans = 0;
        int curr = 0;

        for(int num:nums){

            for(int i = 0; i<32;  i++){

                if((num & (1 << i)) != 0){
                    count[i]++;
                }
            }
        }

        while(k-->0){
            curr = 0;
            for(int i = 0; i<32; i++){
                if(count[i]>0){
                    count[i]--;
                    curr = (curr | (1<<i) );
                }
            }

           ans = (int) ((ans + (long) curr * curr) % MOD);
        }









        return ans;
    }
}