class Solution {
    public boolean judgeSquareSum(int c) {
        int limit = (int) Math.sqrt(c);
        for (int i = 0; i <= limit; i++) {
            int j = (int) Math.sqrt(c - i * i);
            if (i * i + j * j == c) { 
                return true;
            }
        }
        return false;

    }
}