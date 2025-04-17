class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String str: tokens){
            if(str.equals("+")){
                int a1 = s.pop();
                int a2 = s.pop();
                s.push(a1 + a2);
            }
                else if(str.equals("-")){
                int a1 = s.pop();
                int a2 = s.pop();
                s.push(a2-a1);
            }
                else if(str.equals("*")){
                int a1 = s.pop();
                int a2 = s.pop();
                s.push(a1 * a2);

            }
             else if(str.equals("/")){
                int a1 = s.pop();
                int a2 = s.pop();
                s.push(a2/a1);
            }
            else{
                s.push(Integer.parseInt(str));
            }
            

        }
        return s.peek();
        
    }
}