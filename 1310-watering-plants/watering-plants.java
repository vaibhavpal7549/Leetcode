class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0;
        int c = capacity;
        for(int i = 0; i<plants.length; i++){
            if(capacity < plants[i]){
                ans += (2*i);
                capacity = c; 
            }
            ans++;
            capacity -= plants[i];
        }
        return ans;
    }
}