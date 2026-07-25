class Solution {
    public int maxProduct(int n) {
        
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        while(n >0){
            int ld = n%10;
            if(ld >= a && ld >=b){
                b = a;
                a = ld;
                
            }else if(ld >= b){
                b= ld;
            }
            n = n/10;
        }
        return a * b;
    }
}