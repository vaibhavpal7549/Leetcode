class Solution {
    public String decodeString(String s) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Character> stringStack = new Stack<>();

        String temp = "";
        String result = "";
        for(int i = 0; i<s.length();i++){
            int count = 0;
            if(Character.isDigit(s.charAt(i))){
                while(Character.isDigit(s.charAt(i))){
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                integerStack.push(count);
            }else if(s.charAt(i)=='['){
                stringStack.push(s.charAt(i));
            }else if(s.charAt(i) ==']'){
                temp="";
                while(!stringStack.isEmpty()&& stringStack.peek()!='['){
                    temp = stringStack.pop() + temp;
                }
                if(!stringStack.isEmpty()&&stringStack.peek()=='['){
                    stringStack.pop();
                }
                if(!integerStack.isEmpty()){
                    count = integerStack.pop();
                }
                String repeated = temp.repeat(count);
                for(char ch: repeated.toCharArray()){
                    stringStack.push(ch);
                }
            }else{
                stringStack.push(s.charAt(i));
            }

        }
        while(!stringStack.isEmpty()){
            result = stringStack.pop() + result;
        }
        return result;
        
    }
}