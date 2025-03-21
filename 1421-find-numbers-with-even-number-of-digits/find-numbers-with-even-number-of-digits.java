// class Solution {
//     public int findNumbers(int[] nums) {
//         int n = nums.length;
//         int count = 0;
//         for(int i = 0; i<n; i++){
//             int count1 = (int) Math.log10(nums[i]) + 1;
//             if(count1%2==0){
//                 count++;
//             }
//         }
//         return count;
        
//     }
// }

class Solution {
    public int findNumbers(int[] nums) {
      int res=0;
        for(int num:nums) {
            res+=(int)Math.log10(num)&1;
        }
        return res;
    }
}

