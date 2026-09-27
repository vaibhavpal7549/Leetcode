class Solution {
    public String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            
            if(s.charAt(i) != ')'){
                st.push(s.charAt(i));
            }else{
                while(st.peek() != '('){
                    ans.append(st.peek());
                    st.pop();
                }
                st.pop();

                for(int j = 0; j <ans.length(); j++){
                    st.push(ans.charAt(j));
                }
                ans.setLength(0);
                
            }

        }
        while(!st.isEmpty()){ 
           ans.append(st.pop()); 
        }


        return ans.reverse().toString();
    }
}