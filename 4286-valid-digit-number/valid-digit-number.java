class Solution {
    public boolean validDigit(int n, int x) {
        String val = String.valueOf(n);

        int num = 0;
        boolean ch = false;
        if((val.charAt(0) - '0') == x){
            return false;
        }else{
            for(int i = 1; i<val.length(); i++){
                num = val.charAt(i) - '0';
                if(num == x){
                    return true;
                }
            }
        }
        return false;
    }
}