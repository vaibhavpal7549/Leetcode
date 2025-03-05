
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all numbers
        }
        return result;
    }
}



// class Solution {
//     public int singleNumber(int[] nums) {
//         Arrays.sort(nums);
//         for(int i  = 0; i<nums.length; i++){
//             int count = 1;
//             for(int j = i+1; j<nums.length-1; j++){
//                 if(nums[i] == nums[j]){
//                     count++;
//                 }
//                 else{
//                     break;
//                 }

//             }
            
//             if(count == 1){
//                 return nums[i];
//             }
//             else{
//                 i = i + count-1;
//             }
//         }
//         return -1;    
//     }
    
// }

