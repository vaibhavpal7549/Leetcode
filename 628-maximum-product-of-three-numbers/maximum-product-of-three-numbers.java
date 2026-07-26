class Solution {
    public int maximumProduct(int[] nums) {
        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;

        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        for(int ld : nums){
            
            if(ld >=a && ld>=b && ld >= c){
                
                c=b;
                b = a;
                a= ld;
            }else if(ld >=b && ld <= a && ld >= c){
                c=b;
                b=ld;
            }else if(ld >= c && ld <= b){
            
                c = ld;
            }

            if(ld <=s1 && ld >= s2){
                s1 = ld;
            }else if(ld <= s1 && ld <= s2){
                s1=s2;
                s2= ld;
                
            }
            
        }
        int ans1 = s1 * s2 * a;
        int ans2 = a * b * c;
        return Math.max(ans1, ans2);
        
    }
}