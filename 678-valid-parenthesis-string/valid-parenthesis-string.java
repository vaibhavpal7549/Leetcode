class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> exopen= new Stack<>();
        Stack<Integer> exast= new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                exopen.push(i);
            }else if(ch == ')'){
                if(!exopen.isEmpty()){
                    exopen.pop();
                }else if(!exast.isEmpty()){
                    exast.pop();

                }else{
                    return false;
                }
                
            }else{
                exast.push(i);
            }

        }

        while(!exopen.isEmpty()){
            if(exast.isEmpty()){
                return false;
            }
            if(exopen.pop() > exast.pop()){
                return false;
            }

        }
        return exopen.isEmpty();
    }
}