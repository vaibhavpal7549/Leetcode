class Solution {
    public int maxDistance(int[] colors) {
        int ans = 0;

        int j = colors.length-1;
        for(int i = 0; i<colors.length-1; i++){
            if(colors[i] != colors[j]){
                int curr = Math.abs(i - j);
                ans = Math.max(curr, ans);
            }
            
        }
        int s = 0;
        for(int l = colors.length-1; l>=0; l--){
            if(colors[s] != colors[l]){
                int curr = Math.abs(s - l);
                ans = Math.max(curr, ans);
            }
        }

        return ans;
    }
}