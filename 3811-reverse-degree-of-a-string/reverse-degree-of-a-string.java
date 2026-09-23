class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int  index = (26- (ch - 'a')) * (i+1);
            ans = ans + index;
            
        }
        return ans;
    }
}