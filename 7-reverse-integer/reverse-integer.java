class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x != 0){
            int ld = x%10;
            rev = rev*10 + ld;
            x = x/10;
            
        }
        if(rev<= -2147483648 || rev>=2147483647){
            return 0;
        }
        return (int)rev;
        //here the return statement is int so we will typecast here okk
        
    }
}