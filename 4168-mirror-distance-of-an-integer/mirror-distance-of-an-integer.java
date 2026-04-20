class Solution {
public static int reverse(int n){
    int ans = 0;

    while(n>0){
        int ld = n%10;
        ans = ans * 10 +ld;
        n = n/10;
    }
    return ans;
}

    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }
}