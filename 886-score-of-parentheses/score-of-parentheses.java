class Solution {
    public int scoreOfParentheses(String s) {
        Stack<String> st = new Stack<>();
        int temp = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push("(");
            }else if(ch == ')'){
                if(st.peek() == "("){
                    st.pop();
                    st.push("1");
                }else{
                    temp = 0;
                    while(st.peek() != "("){
                        temp += Integer.parseInt(st.pop());
                    }
                    temp *= 2;
                    st.pop();
                    st.push(Integer.toString(temp));
                }
            }else{
                continue;
            }
        }

        int ans = 0;
        while(!st.isEmpty()){
            ans += Integer.parseInt(st.pop());
        }
        return ans;
    }
}