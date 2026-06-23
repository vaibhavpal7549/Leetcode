class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        int b = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++){
            if(b<prices[i]){
                int p = prices[i] - b;
                max = Math.max(max, p);
            }else{
                b =prices[i];
            }
        }
        return max;
    }
}