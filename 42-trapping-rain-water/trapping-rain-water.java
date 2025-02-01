class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left [] = new int[n];
        left[0] = height[0];
        for(int i = 1; i<n;i++){
            left[i] = Math.max(height[i], left[i-1]);
        }

        int right[] = new int[n];
        right[n-1] = height[n-1];
        for(int i = n-2; i>=0;i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        int trapped_water = 0;
        for(int i =0; i<n; i++){
            int water_level = Math.min(left[i], right[i]);
            trapped_water += water_level - height[i];
        }
        return trapped_water;
        
    }
}