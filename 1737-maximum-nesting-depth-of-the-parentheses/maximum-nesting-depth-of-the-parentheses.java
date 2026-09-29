class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int curr = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='('){
                curr += 1;
                ans = Math.max(curr, ans);
            }else if(ch == ')'){
                curr -= 1;
                
            }else{
                continue;
            }
        }
        return ans;
    }
}