class Solution {

    public static boolean helper(int weights [], int days, int mid){
        int count = 1;
        int n = weights.length;
        int capacity = mid;
        int sum = weights[0];
        for(int i = 1; i<n; i++){
            sum += weights[i];
            if(sum > capacity){
                count++;
                sum = weights[i];
            }

        }
        return (count <= days);
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxValue = 0;
        int sum = 0;
        int n = weights.length;
        for(int i = 0; i<n; i++){
            sum += weights[i];
            maxValue = Math.max(maxValue, weights[i]);
        }
        int low = maxValue;
        int high = sum;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(helper(weights, days, mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
    }
}