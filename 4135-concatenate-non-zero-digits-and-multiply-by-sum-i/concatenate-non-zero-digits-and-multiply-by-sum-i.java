class Solution {
    public long sumAndMultiply(int n) {
        
        long x  = 0;
        long sum = 0;
        String str= String.valueOf(n);
        int pow = 0;
        for(int i = 0; i<str.length(); i++){

            char ch = str.charAt(i);
            int d = ch - '0';
            sum += d;
            if(d > 0){
                x = x * 10 + d;
            }
        }



        return x * sum;
    }
}