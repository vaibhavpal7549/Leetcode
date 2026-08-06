class Solution {

    public static int find(int num){
        int ans = 1;
        while(num>0){
            int ld = num%10;
            ans *= ld;
            num = num/10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        
        while(true){
            int prd = find(n);
            if(prd  % t == 0){
                return n;
            }else{
                n++;
                find(n);
            }
        }
    }
}