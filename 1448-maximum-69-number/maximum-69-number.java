class Solution {
    public int maximum69Number (int num) {
        int ans = 0;
        String val = String.valueOf(num);
        int count = 1;
        int curr = 0;
        for(int i = 0; i<val.length(); i++){
            if(val.charAt(i) == '6' && count == 1){
                curr = '9' - '0';
                count--;
            }else{
                curr = val.charAt(i) - '0';
            }

            ans = ans * 10 + curr;
        }
        return ans;
    }
}