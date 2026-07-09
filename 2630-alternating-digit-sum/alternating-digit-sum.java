class Solution {
    public int alternateDigitSum(int n) {
        int ans = 0;
        int id = 1;
        int td = (int) Math.log10(n) + 1;
        if(td %2==0){
            id= 0;
        }
        while(n > 0){
            int d = n %10;
            if(id %2==0){
                ans -= d;
            }else{
                ans += d;
            }
            n = n/10;
            id++;
        }
        return ans;
    }
}