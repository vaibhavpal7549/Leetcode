class Solution {
    public long countCommas(long n) {
        long lower = 1000;
        long res = 0;
        long comma = 1;
        long upper = 0;

        while(lower <= n){
            upper = lower * 1000 - 1;
            if(upper > n){
                upper = n;
            }
            res += (upper-lower + 1) * comma;
            lower *= 1000;
            comma += 1;

        }
        return res;
        
    }
}