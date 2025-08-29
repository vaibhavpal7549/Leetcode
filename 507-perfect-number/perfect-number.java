class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i*i< num; i++){
            if(num%i == 0){
                sum += i;
                if(i != num/i && num/i != num){
                    sum += num/i;
                }
            }
            
        }
        if(sum==num) return true;
        return false;
        
    }
}