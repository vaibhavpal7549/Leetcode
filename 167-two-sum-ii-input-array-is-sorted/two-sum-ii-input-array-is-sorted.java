class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int l = numbers.length;
        int rp = l-1;
        int ans[] = new int[2];
        while(lp<=rp){
            if(numbers[lp] + numbers[rp] == target ){
                ans[0] = lp+1;
                ans[1] = rp+1;
                return ans;
            
            }else if(numbers[lp] + numbers[rp]<target){
                lp++;
            }else{
                rp--;
            }
        }
        return ans;
        
    }
}