class Solution {

    public static int gcd(int a, int b){
        while(b !=0){
            int temp = b;
            b = a%b;
            a= temp;
        }
        return a;
    }
    public int commonFactors(int a, int b) {
        int ans = 0;
        int ff = gcd(a, b);

        int idx = 1;
        while(idx <=ff){
            if(ff%idx == 0) ans++;
            idx++;
        }
        return ans;

    }
}