class Solution {
    public String removeOuterParentheses(String s) {
        int o = 0;
        int c = 0;
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            
            if(o == 0){
                o++;
                continue;
            }else{
                if(s.charAt(i) == '('){
                    o++;
                    ans.append('(');
                }else{
                    c++;
                    if(o == c){
                        
                        o = 0;
                        c = 0;
                        
                    }else{
                        ans.append(')');
                    }

                }
            }
        }
        return ans.toString();
    }
}