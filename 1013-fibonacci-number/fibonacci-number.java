class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        
        int x = 0, y = 1;
        for (int i = 2; i <= n; i++) {
            int temp = x + y;
            x = y;
            y = temp;
        }
        return y;
    }
}
