class Solution {
    public static boolean find(int number){
        int sum = 0;
        while(number>0){
            int ld = number%10;
            sum += ld;
            number = number / 10;
        }
        if(sum%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public int countEven(int num) {
        int count = 0;
        int idx = 1;
        while(idx <= num){
            boolean ch = find(idx);
            if(ch == true) count++;
            idx++;
        }
        return count;
    }
}