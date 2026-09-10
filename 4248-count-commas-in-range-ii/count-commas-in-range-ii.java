class Solution {
    public long countCommas(long n) {
        long start = 1000;
        long res = 0;

        while(start <= n){
            res += n - start + 1;
            start *= 1000;

        }
        return res;
        
    }
}