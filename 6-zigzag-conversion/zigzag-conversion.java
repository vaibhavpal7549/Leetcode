class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<numRows; i++){
            int idx = i;
            int downward = 2*(numRows - 1 - i);
            int upward = 2*i;
            boolean down = true;
            while(idx<s.length()){
                sb.append(s.charAt(idx));
                if(i == 0){
                    idx += downward;
                }else if(i == numRows-1){
                    idx += upward;
                }else{
                    
                    if(down){
                        idx += downward;
                    }else{
                        idx += upward;
                    }
                    down = !down;
                }
            }
            
        }


        return sb.toString();
    }
}