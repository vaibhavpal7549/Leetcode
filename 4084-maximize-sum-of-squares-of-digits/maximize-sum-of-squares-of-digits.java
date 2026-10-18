class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder();

        int t = sum/9;
        int count = t;
        while(t-->0){
            ans.append('9');
        }
        
        int rem = sum%9;
        int d = 0;
        if(rem != 0){
            ans.append(rem);
            d++;
        }
        
        int c = num - (count+d);
        while(c-->0){
            ans.append('0');
        }
        if (sum > 9 * num) {
            return "";
        }

        return ans.toString();

    }
}