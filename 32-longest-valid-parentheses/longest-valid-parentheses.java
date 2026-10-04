class Solution {
    public int longestValidParentheses(String s) {
        int open = 0;
        int close = 0;
        int ans = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }else{
                close++;
                if(close>open){
                    open = 0;
                    close = 0;
                    continue;
                }
                if(open == close){
                    ans = Math.max(ans, open + close);
                }
                
            }
        }
        open = 0;
        close = 0;

        for(int i = s.length()-1; i>=0; i--){
            char ch1 = s.charAt(i);
            if(ch1 == ')'){
                close++;
            }else{
                open++;
                if(open>close){
                    open = 0;
                    close = 0;
                    continue;
                }
                if(open == close){
                    ans = Math.max(ans, open + close);
                }
                
            }
        }
        return ans;
    }
}