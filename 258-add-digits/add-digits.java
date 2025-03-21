class Solution {
    public int addDigits(int num) {

        int sum = num, x = num;

        while(sum > 9){
            sum = 0;

            while(x!=0){
                int ld = x%10;
                sum += ld;
                x = x/10;
            }
            x = sum;
        }
        return sum;
        
    }
}